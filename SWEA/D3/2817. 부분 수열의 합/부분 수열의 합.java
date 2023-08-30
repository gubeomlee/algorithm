import java.util.Scanner;

public class Solution {
	public static void backtrack(int[] arr, int idx, int len, int sum, int temp, int[] result) {
		// 원하는 합계를 만족하는 경우 
		if (temp == sum) {
			result[0]++; // 결과 값 증가 
		} else if (temp < sum) {
			// 백트래킹을 이용한 조합 생성
			for (int i = idx; i < len; i++) {
				temp += arr[i];
				backtrack(arr, i + 1, len, sum, temp, result);
				temp -= arr[i]; // 백트래킹 
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			int sum = sc.nextInt();

			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}

			int[] result = { 0 };
			backtrack(arr, 0, len, sum, 0, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}