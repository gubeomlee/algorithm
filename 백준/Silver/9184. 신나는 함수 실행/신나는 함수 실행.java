import java.util.Scanner;

public class Main {
	public static int w(int a, int b, int c, int[][][] memo) {
		if (memo[a][b][c] != 0) {
			return memo[a][b][c]; // 이미 계산한 값이 있으면 해당 값을 반환한다.
		} else {
			int result;
			if (a <= 0 || b <= 0 || c <= 0) {
				result = 1;
			} else if (a < b && b < c) {
				result = w(a, b, c - 1, memo) + w(a, b - 1, c - 1, memo) - w(a, b - 1, c, memo);
			} else {
				result = w(a - 1, b, c, memo) + w(a - 1, b - 1, c, memo) + w(a - 1, b, c - 1, memo)
						- w(a - 1, b - 1, c - 1, memo);
			}
			memo[a][b][c] = result; // 계산한 값을 memo에 저장한다.
			return result;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 재사용 가능하기 때문에 반복문 밖에 선언한다. 재사용을 통해 메모리를 절약할 수 있다.
		int[][][] memo = new int[21][21][21];
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == -1 && b == -1 && c == -1) {
				break;
			} else if (a <= 0 || b <= 0 || c <= 0) {
				System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, 1);
			} else {
				// 재귀적 풀이에서 중복되는 계산이 많이 발생하는 경우 계산한 값을 저장했다가 다시 사용한다.
				int result;
				if (a > 20 || b > 20 || c > 20) {
					result = w(20, 20, 20, memo);
				} else {
					result = w(a, b, c, memo);
				}
				System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, result);
			}
		}
		sc.close();
	}
}