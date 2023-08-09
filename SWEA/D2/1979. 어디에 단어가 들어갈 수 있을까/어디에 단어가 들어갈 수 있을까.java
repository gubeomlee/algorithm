import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int result = 0;
			int[][] direction = { { 1, 0 }, { 0, 1 } };
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int[] dir : direction) {
						int row = i;
						int col = j;
						// 시작점 앞의 값이 범위 밖이거나 0인 경우에만 검사한다.
						if (row - dir[0] < 0 || col - dir[1] < 0 || matrix[row - dir[0]][col - dir[1]] == 0) {
							int temp = 0; // 연속된 1의 개수 저장하는 변수
							for (int l = 0; l < k; l++) {
								if (0 <= row && row < n && 0 <= col && col < n && matrix[row][col] == 1) {
									temp++; // 연속된 칸이면 카운트
								}
								row += dir[0];
								col += dir[1];
							}
							// 연속된 칸이 k개 일때 다음 값이 범위 밖에거나 0인 경우에만 결과에 더한다.
							if (temp == k && (row >= n || col >= n || matrix[row][col] == 0)) {
								result++;
							}
						}
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}