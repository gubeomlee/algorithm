import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	// 조건을 충족을 했는지 확인하는 메서드
	public static boolean isValid(int[][] matrix, int k, int row, int col) {
		loop1: for (int j = 0; j < col; j++) {
			loop2: for (int i = 0; i <= row - k; i++) {
				for (int l = 1; l < k; l++) {
					if (matrix[i][j] != matrix[i + l][j]) {
						continue loop2;
					}
				}
				continue loop1;
			}
			return false;
		}
		return true;
	}

	public static void backtrack(int[][] matrix, int idx, int cnt, int k, int row, int col, int[] result) {
		if (isValid(matrix, k, row, col)) {
			result[0] = Math.min(result[0], cnt);
		} else if (cnt < result[0] - 1) { // 현재 카운트가 결과값보다 크다면 더이상 확인할 필요없다.
			for (int i = idx; i < row; i++) {
				// 배열 임시 저장
				int[] temp = Arrays.copyOf(matrix[i], col);
				// 주사하지 않은 경우
				backtrack(matrix, i + 1, cnt + 1, k, row, col, result);
				// B를 주사한 경우
				for (int j = 0; j < col; j++)
					matrix[i][j] = 1;
				backtrack(matrix, i + 1, cnt + 1, k, row, col, result);
				// A를 주사한 경우
				for (int j = 0; j < col; j++)
					matrix[i][j] = 0;
				backtrack(matrix, i + 1, cnt + 1, k, row, col, result);
				// 원상복구
				for (int j = 0; j < col; j++) {
					matrix[i][j] = temp[j];
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int d = sc.nextInt();
			int w = sc.nextInt();
			int k = sc.nextInt();

			int[][] matrix = new int[d][w];
			for (int i = 0; i < d; i++) {
				for (int j = 0; j < w; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int[] result = { Integer.MAX_VALUE };
			backtrack(matrix, 0, 0, k, d, w, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}