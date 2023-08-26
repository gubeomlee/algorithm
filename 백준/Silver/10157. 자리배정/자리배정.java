import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		if (x * y >= num) {
			int row = y - 1;
			int col = 0;
			int[][] matrix = new int[y][x];
			int[][] direction = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 시계방향 탐색
			int idx = 0;

			for (int i = 1; i <= x * y; i++) {
				matrix[row][col] = i;
				// 찾는 수자를 찾으면
				if (matrix[row][col] == num) {
					sb.append((col + 1) + " " + (y - row)); // 숫자가 위치한 행과 열을 출력한다.
					break;
				}

				row += direction[idx][0];
				col += direction[idx][1];
				
				if (0 <= row && row < y && 0 <= col && col < x && matrix[row][col] == 0) {
				} else { // 행렬 범위를 벗어났거나, 이미 값이 채워진 경우 
					row -= direction[idx][0]; // 값을 원래대로 되돌리고 
					col -= direction[idx][1];
					idx = (idx + 1) % 4; // 방향 인덱스를 갱신한다. 
					row += direction[idx][0];
					col += direction[idx][1];
				}
			}
		} else {
			sb.append(0); // 찾을 수 없는 경우 
		}
		System.out.println(sb);
		sc.close();
	}
}