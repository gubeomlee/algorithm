import java.io.IOException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int pDay = sc.nextInt();
			int pMonth = sc.nextInt();
			int p3Month = sc.nextInt();
			int pYear = sc.nextInt();

			int[] arr = new int[12];
			for (int i = 0; i < 12; i++) {
				arr[i] = sc.nextInt();
			}

			int[] dp = new int[15];
			for (int i = 3; i < 15; i++) {
				int pd = dp[i - 1] + arr[i - 3] * pDay;
				int pm = dp[i - 1] + pMonth;
				int p3m = dp[i - 3] + p3Month;
				// 최소 비용을 구한다.
				dp[i] = Math.min(pd, Math.min(pm, p3m));
			}
			System.out.printf("#%d %d\n", t, Math.min(pYear, dp[14]));
		}
		sc.close();
	}
}