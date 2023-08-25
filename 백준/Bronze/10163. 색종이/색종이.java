import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[1001][1001];
		int len = sc.nextInt();
		for (int i = 1; i <= len; i++) {
			int col = sc.nextInt();
			int row = sc.nextInt();
			int dc = sc.nextInt();
			int dr = sc.nextInt();
			for (int j = row; j < row + dr; j++) {
				for (int k = col; k < col + dc; k++) {
					matrix[j][k] = i;
				}
			}
		}

		int[] result = new int[len];
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				if (matrix[i][j] != 0) {
					result[matrix[i][j] - 1]++;
				}
			}
		}
		for (int num : result) {
			System.out.println(num);
		}
		sc.close();
	}
}