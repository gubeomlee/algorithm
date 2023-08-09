import java.util.Scanner;

class Solution {
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

			int row = 99;
			int col = 0;
			// 도착 위치 찾기
			for (int i = 0; i < 100; i++) {
				if (matrix[99][i] == 2) {
					col = i;
				}
			}

			int[] direction = { -1, 1 };
			// 맨 아래 행부터 시작하여 1칸씩 올라가며 칸을 이동한다. 
			for (int i = 0; i < 99; i++) {
				for (int dir : direction) {
					// 이동 가능한 경우 
					if (0 <= col + dir && col + dir < 100 && matrix[row][col + dir] == 1) {
						// 열이동  
						while (0 <= col && col < 100 && matrix[row][col] == 1) {
							col += dir;
						}
						col -= dir; // 열이동 완료 보정 
						break;
					}
				}
				row--; // 다음 행으로 이동 
			}
			System.out.printf("#%d %d\n", test_case, col);
		}
		sc.close();
	}
}