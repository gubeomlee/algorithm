import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static boolean isValidIdx(int i, int j, int len) {
		if (0 <= i && i < len && 0 <= j && j < len) {
			return true;
		}
		return false;
	}

	public static void getCnt(int[][] matrix, int len, int r, int c, int[] result) {
		int[][] direction = { { -1, 1 }, { 1, 1 }, { 1, -1 }, { -1, -1 } };

		for (int i = 1; i < len - 1; i++) { // 좌상단, 우하단 길이
			loop: for (int j = 1; j < len - 1; j++) { // 조하단, 우상단 길이
				Set<Integer> set = new HashSet<>();
				int cnt = 0;
				int row = r;
				int col = c;
				for (int k = 0; k < i; k++) {
					row += direction[0][0];
					col += direction[0][1];
					if (isValidIdx(row, col, len) && set.add(matrix[row][col])) {
						cnt++;
					} else {
						continue loop;
					}
				}
				for (int k = 0; k < j; k++) {
					row += direction[1][0];
					col += direction[1][1];
					if (isValidIdx(row, col, len) && set.add(matrix[row][col])) {
						cnt++;
					} else {
						continue loop;
					}
				}
				for (int k = 0; k < i; k++) {
					row += direction[2][0];
					col += direction[2][1];
					if (isValidIdx(row, col, len) && set.add(matrix[row][col])) {
						cnt++;
					} else {
						continue loop;
					}
				}
				for (int k = 0; k < j; k++) {
					row += direction[3][0];
					col += direction[3][1];
					if (isValidIdx(row, col, len) && set.add(matrix[row][col])) {
						cnt++;
					} else {
						continue loop;
					}
				}
				result[0] = Math.max(result[0], cnt);
			}
		}
	}

	public static void main(String[] args) {
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

			int[] result = { -1 };

			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					getCnt(matrix, len, i, j, result); // 탐색 시작위치
				}
			}
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}