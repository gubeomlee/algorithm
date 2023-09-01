import java.util.Scanner;

public class Solution {
	// 거리를 계산하는 메서드
	public static int getLen(int[][] matrix, int len, int[] temp) {
		int sum = 0;
		int idx = 2;
		// 첫 번째 점과 두 번재 점 사이의 거리
		sum += Math.abs(matrix[0][0] - matrix[temp[idx]][0]) + Math.abs(matrix[0][1] - matrix[temp[idx]][1]);
		// 중간 점들 사이의 거리
		for (int i = 2; i < len - 1; i++) {
			sum += Math.abs(matrix[temp[idx]][0] - matrix[temp[idx + 1]][0])
					+ Math.abs(matrix[temp[idx]][1] - matrix[temp[idx + 1]][1]);
			idx++;
		}
		// 마지막 점과의 거리
		sum += Math.abs(matrix[1][0] - matrix[temp[idx]][0]) + Math.abs(matrix[1][1] - matrix[temp[idx]][1]);
		return sum;
	}
	// 순열을 생성하고 최소 거리를 계산하는 메서드 
	public static void backtrack(int[][] matrix, int len, int idx, int[] temp, boolean[] check, int[] result) {
		if (idx == len) {
			result[0] = Math.min(result[0], getLen(matrix, len, temp));
		} else {
			for (int i = 2; i < len; i++) {
				if (!check[i]) {
					check[i] = true;
					temp[idx] = i;
					backtrack(matrix, len, idx + 1, temp, check, result);
					check[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt() + 2;
			int[][] matrix = new int[len + 2][2];
			for (int i = 0; i < len; i++) {
				matrix[i][0] = sc.nextInt();
				matrix[i][1] = sc.nextInt();
			}

			int[] result = { Integer.MAX_VALUE };
			backtrack(matrix, len, 2, new int[len], new boolean[len], result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}