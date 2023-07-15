import java.util.Scanner;

class Solution {
	public static int calculateMaxSum(int[][] matrix, int n, int m) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				for (int k = 1; k < m; k++) { // + 형태 분사하는 경우
					if (i - k >= 0)
						temp += matrix[i - k][j];
					if (j - k >= 0)
						temp += matrix[i][j - k];
					if (i + k < n)
						temp += matrix[i + k][j];
					if (j + k < n)
						temp += matrix[i][j + k];
				}
				result = Math.max(result, temp);
				temp = matrix[i][j];
				for (int k = 1; k < m; k++) { // x 형태 분사하는 경우
					if (i - k >= 0 && j - k >= 0)
						temp += matrix[i - k][j - k];
					if (i - k >= 0 && j + k < n)
						temp += matrix[i - k][j + k];
					if (i + k < n && j - k >= 0)
						temp += matrix[i + k][j - k];
					if (i + k < n && j + k < n)
						temp += matrix[i + k][j + k];
				}
				result = Math.max(result, temp);
			}
		}
		return result;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					matrix[i][j] = sc.nextInt();
			int result = calculateMaxSum(matrix, n, m);
			System.out.printf("#%d %d\n", test_case, result);

		}
		sc.close();
	}
}