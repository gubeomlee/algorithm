import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
			int[][] matrix = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int result = 0;
			int dig1 = 0; // 왼쪽 위에서 시작하는 대각선 합
			int dig2 = 0; // 오른쪽 위에서 시작하는 대각선 합
			for (int i = 0; i < 100; i++) {
				int row = 0;
				int col = 0;
				for (int j = 0; j < 100; j++) {
					row += matrix[i][j]; // 행의 합
					col += matrix[j][i]; // 열의 합
				}
				dig1 += matrix[i][i];
				dig2 += matrix[99 - i][i];
				result = Math.max(result, Math.max(row, col));
			}
			result = Math.max(result, Math.max(dig1, dig2));
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}