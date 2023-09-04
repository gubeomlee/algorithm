import java.util.Scanner;

public class Solution {
	public static void backtrack(int[] arr, int idx, int sum, int testSum, int[] result) {
		for (int i = idx; i < arr.length; i++) {
			int tempSum = testSum + arr[i];
			if (tempSum < sum) {
				backtrack(arr, i + 1, sum, tempSum, result);
			} else {
				result[0] = Math.min(result[0], tempSum);
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

			int[] result = { Integer.MAX_VALUE };
			backtrack(arr, 0, sum, 0, result);
			System.out.printf("#%d %d\n", t, result[0] - sum);
		}
		sc.close();
	}
}