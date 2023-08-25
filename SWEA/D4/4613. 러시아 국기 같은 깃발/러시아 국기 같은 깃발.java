import java.util.Scanner;

public class Solution {
	// 색상 조합에 대한 변환 횟수를 구하는 메서드
	public static int getCnt(char[][] matrix, int m, int w, int b, int r) {
		int cnt = 0;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] != 'W') {
					cnt++;
				}
			}
		}
		for (int i = w; i < w + b; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] != 'B') {
					cnt++;
				}
			}
		}
		for (int i = w + b; i < w + b + r; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] != 'R') {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			char[][] matrix = new char[n][m];
			for (int i = 0; i < n; i++) {
				matrix[i] = sc.next().toCharArray();
			}
			// 조합의 최소 변환횟수 계산
			int result = Integer.MAX_VALUE;
			for (int i = 1; i <= n - 2; i++) {
				for (int j = 1; j <= n - i - 1; j++) {
					result = Math.min(result, getCnt(matrix, m, i, j, n - i - j));
				}
			}
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}