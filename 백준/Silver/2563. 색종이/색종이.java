import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		int result = 0;
		int[][] matrix = new int[100][100];
		for (int i = 0; i < len; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int row = 0; row < 10; row++) {
				for (int col = 0; col < 10; col++) {
					if (matrix[row + y][col + x] == 0) { // 겹치지 않는 영역인 경우
						result++; // 카운트 증가
					}
					matrix[row + y][col + x] = 1; // 카운트 표시
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}