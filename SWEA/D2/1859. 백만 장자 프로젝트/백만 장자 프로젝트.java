import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();

			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}

			long[] dp = new long[len]; // 각 위치에서 최대이익 저장
			int max = arr[len - 1];
			// 뒤에서부터 dp를 채운다.
			for (int i = len - 2; i >= 0; i--) {
				if (arr[i] >= max) { // 현재 위치값이 max보다 크거나 같으면
					max = arr[i]; // 최댓값을 갱신하고
					dp[i] = dp[i + 1]; // 현재위치 이익은 이전 위치와 같다.
				} else {
					dp[i] = dp[i + 1] + max - arr[i]; // 현재 위치 이익을 갱신한다.
				}
			}
			System.out.printf("#%d %d\n", t, dp[0]);
		}
		sc.close();
	}
}