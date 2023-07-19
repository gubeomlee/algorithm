import java.util.Scanner;

public class Main {
	// 체스판 내에서 다른 색의 칸의 개수를 반환하는 메서드
	public static int getCnt(char[][] matrix, int row, int col, char testChar) {
		int cnt = 0;
		for (int i = row; i < row + 8; i++) {
			for (int j = col; j < col + 8; j++) {
				// 인덱스 합이 짝수인 경우와 홀수인 경우를 구분하여 첫 블록의 색(testChar)과 비교한다.
				if ((i + j) % 2 == 0 && matrix[i][j] != testChar) {
					cnt++;
				}
				if ((i + j) % 2 == 1 && matrix[i][j] == testChar) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		char[][] matrix = new char[n][m];
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				matrix[i][j] = input.charAt(j);
			}
		}
		int result = 64;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int temp1 = getCnt(matrix, i, j, 'W'); // 'W'로 시작하는 경우
				int temp2 = getCnt(matrix, i, j, 'B'); // 'B'로 시작하는 경우
				int temp = Math.min(temp1, temp2); // 더 적은 개수로 채울 수 있는 경우 선택
				result = Math.min(result, temp); // 현재까지의 최솟값과 비교하여 갱신
			}
		}
		System.out.println(result);
		sc.close();
	}
}