import java.util.Arrays;
import java.util.Scanner;

class Solution {
	// 배열의 두 값의 위치를 교환하는 메서드
	public static char[] swap(char[] nums, int i, int j) {
		char[] temp = Arrays.copyOf(nums, nums.length);
		temp[i] = nums[j];
		temp[j] = nums[i];
		return temp;
	}

	public static void dfs(char[] nums, int cnt, int[] result) {
		if (cnt == 0) {
			result[0] = Math.max(result[0], Integer.parseInt(new String(nums)));
		} else {
			int len = nums.length;
			for (int i = 0; i < len - 1; i++) {
				for (int j = i + 1; j < len; j++) {
					dfs(swap(nums, i, j), cnt - 1, result);
				}
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int test_case = 1; test_case <= T; test_case++) {
			int input = sc.nextInt();
			int cnt = sc.nextInt();

			char[] nums = Integer.toString(input).toCharArray();

			int[] result = { 0 };

			int len = nums.length; // 최대 교환 횟수는 len -1로 고정한다.
			if (cnt > len - 1) {
				dfs(nums, len - 1, result);
				if ((cnt - len) % 2 == 0) { // cnt - len 값이 짝수 인 경우 1의 자리와 10의 자리 값을 교환한다.
					char[] temp_result = Integer.toString(result[0]).toCharArray();
					result[0] = Integer.parseInt(new String(swap(temp_result, len - 1, len - 2)));
				}
			} else {
				dfs(nums, cnt, result);
			}
			System.out.printf("#%d %d\n", test_case, result[0]);
		}
		sc.close();
	}
}