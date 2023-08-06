import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[][] matrix = new int[len][len];
		// 빗변이 2시 방향을 향하는 직각삼각형으로 구조화하여 문제를 푼다.
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i + 1; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int[][] dp = new int[len][len];
		dp[0][0] = matrix[0][0];
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				// 현재 위치에서 아래쪽, 대각선 방향 이동하며 최댓값을 갱신한다.
				dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + matrix[i + 1][j]);
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + matrix[i + 1][j + 1]);
			}
		}

		int result = Integer.MIN_VALUE;
		for (int num : dp[len - 1]) {
			result = Math.max(result, num);
		}
		System.out.println(result);
		sc.close();
	}
}