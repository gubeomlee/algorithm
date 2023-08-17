import java.util.Scanner;

class Solution {
	// 재귀를 이용한 거듭제곱을 구한다.
	public static int getPow(int num, int pow, int result) {
		if (pow == 0) {
			return result;
		} else {
			// 현재 결과에 밑을 곱하고 지수를 1을 감소시킨다.
			return getPow(num, pow - 1, result * num);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
			int num = sc.nextInt();
			int pow = sc.nextInt();
			int result = getPow(num, pow, 1);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}