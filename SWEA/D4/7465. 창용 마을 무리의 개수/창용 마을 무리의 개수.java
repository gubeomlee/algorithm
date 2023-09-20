import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[][] matrix = new int[n + 1][n + 1];
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				matrix[x][y] = matrix[y][x] = 1;
			}

			int cnt = 0;
			boolean[] check = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				if (!check[i]) { // 확인하지 않은 경우
					cnt++;
					Queue<Integer> que = new LinkedList<>();
					que.add(i);
					check[i] = true;
					while (!que.isEmpty()) { // bfs를 통해 아는 사람을 체크한다.
						int idx = que.poll();
						for (int j = 0; j <= n; j++) {
							if (matrix[idx][j] == 1 && !check[j]) {
								que.add(j);
								check[j] = true;
							}
						}
					}
				}
			}
			System.out.printf("#%d %d\n", t, cnt);
		}
		sc.close();
	}
}