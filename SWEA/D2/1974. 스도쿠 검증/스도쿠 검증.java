import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
	public static int sudoku(int[][] matrix) {
		int[][] index = { { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 }, { 0, 0, 0, 1, 1, 1, 2, 2, 2 },
				{ 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 }, { 3, 3, 3, 4, 4, 4, 5, 5, 5 },
				{ 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 }, { 6, 6, 6, 7, 7, 7, 8, 8, 8 } };
		ArrayList<Set<Integer>> idx_set = new ArrayList<>();
		ArrayList<Set<Integer>> row_set = new ArrayList<>();
		ArrayList<Set<Integer>> col_set = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			row_set.add(new HashSet<>());
			col_set.add(new HashSet<>());
			idx_set.add(new HashSet<>());
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int num = matrix[i][j];
				if (!row_set.get(i).add(num) || !col_set.get(j).add(num) || !idx_set.get(index[i][j]).add(num)) 
					// add() 메서드는 중복되는 값이 존재하는 경우 false를 반환한다. 
					return 0; // 유효하지 않은 스도쿠 
			}
		}
		return 1; // 유효한 스도쿠 
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] matrix = new int[9][9];
			for (int i = 0; i < 9; i++)
				for (int j = 0; j < 9; j++)
					matrix[i][j] = sc.nextInt();
			int result = sudoku(matrix);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}