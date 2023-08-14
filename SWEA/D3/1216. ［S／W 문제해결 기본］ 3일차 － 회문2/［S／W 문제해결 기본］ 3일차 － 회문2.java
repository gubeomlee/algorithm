import java.util.Scanner;

class Solution {
	public static int palindrome(char[][] matrix) {
		int result = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				// 가로 방향 회문 검사
				for (int k = j; k < 100; k++) {
					int cnt = 0;
					for (int l = 0; l < (k - j + 1) / 2; l++) {
						if (matrix[i][j + l] != matrix[i][k - l]) {
							break;
						}
						cnt++;
					}
					if (cnt == (k - j + 1) / 2) {
						result = Math.max(result, k - j + 1);
					}
				}
				// 세로 방향 회문 검사
				for (int k = j; k < 100; k++) {
					int cnt = 0;
					for (int l = 0; l < (k - j + 1) / 2; l++) {
						if (matrix[j + l][i] != matrix[k - l][i]) {
							break;
						}
						cnt++;
					}
					if (cnt == (k - j + 1) / 2) {
						result = Math.max(result, k - j + 1);
					}
				}
			}
		}
		return result;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
			char[][] matrix = new char[100][100];
			for (int i = 0; i < 100; i++) {
				matrix[i] = sc.next().toCharArray();
			}
			int result = palindrome(matrix);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}