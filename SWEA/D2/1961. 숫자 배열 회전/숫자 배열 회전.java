import java.util.ArrayList;
import java.util.Scanner;

class Solution {
	// 2차원 배열을 90도 회전시키는 메서드
	public static int[][] rotateMatrix(int[][] matrix, int len) {
		int[][] result = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				result[j][len - i - 1] = matrix[i][j];
			}
		}
		return result;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			int[][] matrix = new int[len][len];
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			ArrayList<ArrayList<Integer>> result = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				result.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < 3; i++) {
				matrix = rotateMatrix(matrix, len);
				for (int j = 0; j < len; j++) {
					for (int num : matrix[j]) {
						result.get(j).add(num);
					}
				}
			}

			System.out.printf("#%d\n", test_case);
			for (ArrayList<Integer> innerList : result) {
				for (int i = 0; i < len * 3; i++) {
					System.out.print(innerList.get(i));
					if (i % len == len - 1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}