import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			String result = "Possible";
			int cnt = k; // 현재 생산량
			int time = m; // 현재 시간
			for (int i = 0; i < n; i++) {
				if (time <= arr[i]) { // 현재 시간 이후에 도착했다면
					cnt--; // 붕어빵 구매
				}
				if (time > arr[i] || cnt < 0) { // 현재 시간 이전에 도착하거나 현재 생산량이 음수가 되는 경우
					result = "Impossible";
					break;
				}
				if (i < n - 1 && time + m <= arr[i + 1]) { // 다음 고객이 다음 생산 시간 이후에 도착한면
					cnt += k; // 생산량을 갱신한다.
					time += m; // 현재 시간을 갱신한다.
				}
			}
			System.out.printf("#%d %s\n", test_case, result);
		}
		sc.close();
	}
}