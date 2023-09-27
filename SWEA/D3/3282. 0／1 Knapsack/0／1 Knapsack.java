import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[][] matrix = new int[n][2];
			for (int i = 0; i < n; i++) {
				matrix[i][0] = sc.nextInt();
				matrix[i][1] = sc.nextInt();
			}

			int[] dp = new int[k + 1];

			for (int i = 0; i < n; i++) {
				int v = matrix[i][0];
				int c = matrix[i][1];

				for (int j = k; j >= v; j--) {
					dp[j] = Math.max(dp[j], dp[j - v] + c);
				}
			}
			System.out.printf("#%d %d\n", t, dp[k]);
		}
		sc.close();
	}
}