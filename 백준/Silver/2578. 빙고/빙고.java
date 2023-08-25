import java.util.Scanner;

public class Main {
	// 해당 위치에서 시작하는 방향으로 5개 숫자가 모드 체크되었는지 확인하는 메서드
	public static int isFive(int[][] matrix, int row, int col, int dr, int dc) {
		for (int i = 0; i < 5; i++) {
			if (matrix[row][col] == 0) { // 체그되지 않은 경우
				return 0; // 빙고가 아니다.
			}
			row += dr;
			col += dc;
		}
		return 1;
	}

	public static boolean bingo(int[][] matrix) {
		int cnt = 0;
		cnt += isFive(matrix, 0, 0, 1, 1); // 왼쪽 위에서 시작하는 대각선
		cnt += isFive(matrix, 0, 4, 1, -1); // 오른쪽 위에서 시작하는 대각선
		for (int i = 0; i < 5; i++) {
			cnt += isFive(matrix, 0, i, 1, 0); // 세로방향
			cnt += isFive(matrix, i, 0, 0, 1); // 가로방향
		}
		if (cnt >= 3) { // 3줄 이상 체크된 경우
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int result = 0;

		// 빙고판 입력 및 빙고 상태 체크
		int[][] testMatrix = new int[5][5];
		loop: for (int i = 0; i < 25; i++) {
			int num = sc.nextInt();
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					if (matrix[j][k] == num) {
						result++;
						testMatrix[j][k] = 1;
						if (bingo(testMatrix)) {
							break loop;
						}
					}
				}
			}
		}

		System.out.println(result);
		sc.close();
	}
}