import java.util.Scanner;

public class Solution {
	public static String five(char[][] matrix, int len) {
		int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, -1 }, { -1, 1 }, { 1, 1 }, { -1, -1 }, };
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (matrix[i][j] == 'o') {
					for (int[] dir : direction) { // 8방향 탐색
						int cnt = 0;
						int row = i;
						int col = j;
						for (int k = 0; k < 4; k++) {
							row += dir[0];
							col += dir[1];
							if (0 <= row && row < len && 0 <= col && col < len && matrix[row][col] == 'o') {
								cnt++;
							}
						}
						if (cnt == 4) { // 연속하는 o의 개수가 5개인 경우
							return "YES";
						}
					}
				}
			}
		}
		return "NO";
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			char[][] matrix = new char[len][len];
			for (int i = 0; i < len; i++) {
				matrix[i] = sc.next().toCharArray();
			}

			String result = five(matrix, len);
			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}