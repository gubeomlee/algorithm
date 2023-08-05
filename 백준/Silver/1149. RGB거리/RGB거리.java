import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[][] arr = new int[len][3];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] dp = new int[len][3];
		dp[0] = arr[0];
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < 3; j++) {
				// 이전 행의 최댓값을 찾는다.
				int tempMin = Integer.MAX_VALUE;
				for (int l = 0; l < 3; l++) {
					if (j != l) {
						tempMin = Math.min(tempMin, dp[i - 1][l]);
					}
				}
				// 현재 색상을 선택하는 경우 최솟값을 저장한다.
				dp[i][j] = arr[i][j] + tempMin;
			}
		}
		// 마지막 행에서 최솟값을 찾는다.
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			result = Math.min(result, dp[len - 1][i]);
		}
		System.out.println(result);
		sc.close();
	}
}