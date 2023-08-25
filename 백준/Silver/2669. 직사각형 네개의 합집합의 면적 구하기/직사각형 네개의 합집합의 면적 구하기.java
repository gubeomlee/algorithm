import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[100][100];
		int result = 0;
		for (int i = 0; i < 4; i++) {
			int lx = sc.nextInt();
			int ly = sc.nextInt();
			int rx = sc.nextInt();
			int ry = sc.nextInt();
			for (int j = lx; j < rx; j++) {
				for (int k = ly; k < ry; k++) {
					if (matrix[j][k] == 0) {
						result++;
					}
					matrix[j][k] = 1;
				}
			}

		}
		System.out.println(result);
		sc.close();
	}
}