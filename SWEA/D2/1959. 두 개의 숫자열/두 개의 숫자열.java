import java.util.Scanner;

class Solution {
	// 두 배열의 요소를 곱하여 최댓값을 구하는 메서드 
	public static int maxMultiple(int n, int m, int[] nArr, int[] mArr) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i <= m - n; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				temp += nArr[j] * mArr[i + j];
			}
			result = Math.max(result, temp);
		}
		return result;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] nArr = new int[n];
			int[] mArr = new int[m];
			for (int i = 0; i < n; i++) {
				nArr[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				mArr[i] = sc.nextInt();
			}

			int result;
			if (n < m) {
				result = maxMultiple(n, m, nArr, mArr);
			} else {
				result = maxMultiple(m, n, mArr, nArr);
			}

			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}