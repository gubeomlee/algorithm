import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			int[][] matrix = new int[len][len];
			int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

			int row = 0;
			int col = 0;
			int cnt = 1;
			int length = len - 1;
			while (cnt < len * len) {
				for (int[] dir : direction) {
					for (int i = 0; i < length; i++) {
						matrix[row][col] = cnt++;
						row += dir[0];
						col += dir[1];
					}
				}
				row++; // 회전 후 현재 위치 조정
				col++;
				length -= 2; // 회전 범위 조정
			}

			if (len % 2 == 1) { // 배열의 길이가 홀수 일때 마지막 값 처리
				matrix[row][col] = cnt;
			}

			System.out.printf("#%d\n", test_case);
			for (int[] arr : matrix) {
				for (int num : arr) {
					System.out.printf("%d ", num);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}