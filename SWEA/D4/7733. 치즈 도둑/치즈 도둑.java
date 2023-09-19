import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
    public static int getLump(int[][] matrix, boolean[][] check, int len, int day) {
        int lump = 0;
        Queue<int[]> que = new LinkedList<>();
        int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
 
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (!check[i][j] && matrix[i][j] > day) {
                    lump++;
                    que.add(new int[] { i, j });
                    while (!que.isEmpty()) {
                        int[] cur = que.poll();
                        check[cur[0]][cur[1]] = true;
                        for (int[] dir : direction) {
                            int row = cur[0] + dir[0];
                            int col = cur[1] + dir[1];
                            if (0 <= row && row < len && 0 <= col && col < len && !check[row][col]
                                    && matrix[row][col] > day) {
                                check[row][col] = true;
                                que.add(new int[] { row, col });
                            }
                        }
                    }
                }
            }
        }
        return lump;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int len = sc.nextInt();
 
            int[][] matrix = new int[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
 
            int result = 0;
 
            for (int i = 0; i < 100; i++) {
                int cnt = getLump(matrix, new boolean[len][len], len, i);
                if (cnt == 0)
                    break;
                result = Math.max(result, cnt);
            }
            System.out.printf("#%d %d\n", t, result);
        }
        sc.close();
    }
}