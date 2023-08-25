import java.util.Scanner;

public class Solution {
	// 주어진 정수가 단조증가 수열인지 확인하는 메서드
	public static int isMonotonIncreasing(int num) {
		char[] arr = Integer.toString(num).toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) { // 단조증가 수열이 아닌경우
				return -1;
			}
		}
		return num;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();

			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}

			int result = Integer.MIN_VALUE;
			// 가장 큰 단조증가 수열을 찾는다.
			for (int i = 0; i < len - 1; i++) {
				for (int j = i + 1; j < len; j++) {
					result = Math.max(result, isMonotonIncreasing(arr[i] * arr[j]));
				}
			}
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}