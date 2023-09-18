import java.util.Scanner;

public class Solution {
	// 가장 긴 사이클을 찾는 메서드
	public static void dfs(int[][] matrix, boolean[] check, int node, int temp, int[] result) {
		for (int i = 1; i < matrix.length; i++) {
			if (!check[i] && (matrix[node][i] == 1 || node == 0)) {
				check[i] = true;
				dfs(matrix, check, i, temp + 1, result);
				check[i] = false;
			} else {
				// 이미 방문한 경우 결과값 갱신
				result[0] = Math.max(result[0], temp);
			}
		}
	}

	public static void main(String[] args) {
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

			int[] result = { 0 };
			boolean[] check = new boolean[n + 1];
			dfs(matrix, check, 0, 0, result);

			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}