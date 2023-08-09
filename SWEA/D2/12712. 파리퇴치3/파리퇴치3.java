import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int result = 0;
			int[][] direction1 = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
			int[][] direction2 = { { 1, -1 }, { -1, 1 }, { 1, 1 }, { -1, -1 } };
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int temp = matrix[i][j];
					for (int[] dir : direction1) { // 상하좌우 방향으로 합을 계산 
						int row = i;
						int col = j;
						for (int k = 0; k < m - 1; k++) {
							row += dir[0];
							col += dir[1];
							if (0 <= row && row < n && 0 <= col && col < n) {
								temp += matrix[row][col]; // 범위 내의 요소를 더함
							}
						}
					}
					result = Math.max(result, temp);
					temp = matrix[i][j]; // 현재 위치 값으로 초기화 
					for (int[] dir : direction2) { // 대각선 방향으로 합을 계산
						int row = i;
						int col = j;
						for (int k = 0; k < m - 1; k++) {
							row += dir[0];
							col += dir[1];
							if (0 <= row && row < n && 0 <= col && col < n) {
								temp += matrix[row][col]; // 범위 내의 요소를 더함
							}
						}
					}
					result = Math.max(result, temp);
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}