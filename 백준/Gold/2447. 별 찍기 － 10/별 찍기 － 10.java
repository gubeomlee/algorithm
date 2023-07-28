import java.util.Scanner;

public class Main {
	public static void func(char[][] matrix, int len, int row, int col) {
		len /= 3;
		if (len >= 1) {
			// 중앙 부분 공백으로 만들기 
			for (int i = row + len; i < row + len * 2; i++) {
				for (int j = col + len; j < col + len * 2; j++) {
					matrix[i][j] = ' ';
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					// '*' 제거방식을 취했기 때문에 i==1 && j==1에서 예외처리 할 필요가 없다.
					func(matrix, len, row + len * i, col + len * j);
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		char[][] matrix = new char[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				matrix[i][j] = '*';
			}
		}

		func(matrix, len, 0, 0);
		for (char[] arr : matrix) {
			System.out.println(arr);
		}
	}
}
