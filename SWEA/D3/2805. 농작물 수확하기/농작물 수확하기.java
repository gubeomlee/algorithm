import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			int[][] matrix = new int[len][len];

			for (int i = 0; i < len; i++) {
				String input = sc.next();
				for (int j = 0; j < len; j++) {
					matrix[i][j] = input.charAt(j) - '0';
				}
			}

			int result = 0;
			int idx = 0;
			for (int i = 0; i < len; i++) {
				result += matrix[i][len / 2]; // 가운데
				for (int j = 1; j <= idx; j++) {
					result += matrix[i][len / 2 + j]; // 오른쪽 대칭
					result += matrix[i][len / 2 - j]; // 왼쪽 대칭
				}
				if (i < len / 2) {
					idx++; // 대칭 횟수 증가
				} else {
					idx--; // 대칭 횟수 감소
				}
			}
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}