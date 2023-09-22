import java.io.IOException;
import java.util.Scanner;

public class Solution {
	public static void dfs(int[][] matrix, boolean[][] visited, int[][] direction, int[] cur, int[] end, int[] result) {
		if (cur[0] == end[0] && cur[1] == end[1]) {
			result[0] = 1;
		} else {
			for (int[] dir : direction) {
				int row = cur[0] + dir[0];
				int col = cur[1] + dir[1];
				if (0 <= row && row < 100 && 0 <= col && col < 100 && matrix[row][col] != 1 && !visited[row][col]) {
					visited[row][col] = true;
					dfs(matrix, visited, direction, new int[] { row, col }, end, result);
					visited[row][col] = false;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			sc.nextInt();

			int[][] matrix = new int[100][100];
			int[] start = new int[2];
			int[] end = new int[2];

			for (int i = 0; i < 100; i++) {
				String input = sc.next();
				for (int j = 0; j < 100; j++) {
					matrix[i][j] = input.charAt(j) - '0';
					if (matrix[i][j] == 2) {
						start = new int[] { i, j };
					}
					if (matrix[i][j] == 3) {
						end = new int[] { i, j };
					}
				}
			}

			int[] result = { 0 };
			int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
			dfs(matrix, new boolean[100][100], direction, start, end, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}