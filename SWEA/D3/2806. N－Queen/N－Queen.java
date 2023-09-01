import java.util.Scanner;

public class Solution {
	// 현재위치에 놓을 수 있는지
	public static boolean isSafe(int[] arr, int row, int col) {
		for (int i = 0; i < row; i++) {
			// 같은 열 또는 대각선에 있는지 확인
			if (arr[i] == col || Math.abs(i - row) == Math.abs(arr[i] - col)) {
				return false;
			}
		}
		return true;
	}

	public static void backtrack(int len, int[] arr, int row, int[] result) {
		if (len == row) {
			result[0]++;
		} else {
			for (int col = 0; col < len; col++) {
				if (isSafe(arr, row, col)) {
					arr[row] = col; // 현재위치에 놓는다.
					backtrack(len, arr, row + 1, result);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			int[] arr = new int[len];
			int[] result = { 0 };

			backtrack(len, arr, 0, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}