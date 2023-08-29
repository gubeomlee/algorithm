import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	// 유효한 암호인지 확인하는 메서드
	public static int getResult(int[] secret) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				sum1 += secret[i];
			} else {
				sum2 += secret[i];
			}
		}

		if ((sum1 * 3 + sum2) % 10 == 0) {
			return sum1 + sum2;
		} else {
			return 0;
		}
	}

	// 주어진 코드에서 암호배열 추출하는 메서드
	public static int[] getSecret(char[] code, int n, int m) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(13, 0);
		map.put(25, 1);
		map.put(19, 2);
		map.put(61, 3);
		map.put(35, 4);
		map.put(49, 5);
		map.put(47, 6);
		map.put(59, 7);
		map.put(55, 8);
		map.put(11, 9);

		int idx = 0;
		int[] secret = new int[8];
		for (int i = 0; i < 8; i++) {
			int temp = 0;
			for (int j = 6; j >= 0; j--) {
				temp += (code[idx] - '0') * (int) Math.pow(2, j);
				idx++;
			}
			secret[i] = map.get(temp);
		}
		return secret;
	}

	// 주어진 배열에서 암호코드 추출하는 메서드
	public static char[] getCode(char[][] matrix, int n, int m) {
		char[] code = new char[56];

		loop: for (int i = 0; i < n; i++) {
			for (int j = m - 1; j >= 0; j--) {
				if (matrix[i][j] == '1') {
					for (int k = 0; k < 56; k++) {
						code[55 - k] = matrix[i][j - k];
					}
					break loop;
				}
			}
		}
		return code;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			char[][] matrix = new char[n][m];
			for (int i = 0; i < n; i++) {
				matrix[i] = sc.next().toCharArray();
			}

			char[] code = getCode(matrix, n, m);
			int[] secret = getSecret(code, n, m);
			int result = getResult(secret);

			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}