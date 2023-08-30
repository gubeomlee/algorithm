import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			String result = "ON";
			for (int i = 0; i < n; i++) {
				// i번째 비트가 0이면
				if ((m & 1 << i) == 0) {
					result = "OFF"; // 스위치 OFF
				}
			}
			System.out.printf("#%d %s\n", t, result);
		}
		sc.close();
	}
}