import java.util.Scanner;

public class Solution {
	// 인접한 지뢰들의 갯수를 확인하고 보드를 업데이트하는 메서드
	public static boolean getAdjacentMines(char[][] board, int size, int i, int j, int flag) {
		int count = 0; // 클릭한 위치의 주변 지뢰 개수 계산
		int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };
		for (int[] dir : directions) {
			int row = dir[0] + i;
			int col = dir[1] + j;
			if (0 <= row && row < size && 0 <= col && col < size && board[row][col] == '*') {
				count++;
			}
		}
		if (flag == 1) {
			board[i][j] = '0'; // 플래그가 설정되면 현재 셀을 빈 공간('0')으로 설정
		}
		if (count == 0) {
			board[i][j] = '0';
			for (int[] dir : directions) {
				int row = dir[0] + i;
				int col = dir[1] + j;
				if (0 <= row && row < size && 0 <= col && col < size && board[row][col] != '0') {
					getAdjacentMines(board, size, row, col, 1); // 재귀 돌 때 플래그를 설정한다.
				}
			}
			return true; // 클릭 위치의 주변 지뢰 개수가 0인 경우는 1을 더한다. 
		}
		return false; // 클릭 위치의 주변 지뢰 개수가 0이 아닌 경우는 1을 더하지 않는다. 
	}

	// 빈 공간의 개수를 세는 메서드
	public static int countEmptySpaces(char[][] board, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j] == '.' && getAdjacentMines(board, size, i, j, 0)) { // 재귀를 돌기 전에는 플래그를 설정하지 않는다. 
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int size = sc.nextInt();
			sc.nextLine();

			char[][] board = new char[size][size];
			for (int i = 0; i < size; i++) {
				board[i] = sc.nextLine().toCharArray();
			}

			int result = countEmptySpaces(board, size);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (board[i][j] == '.') {
						result++;
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}