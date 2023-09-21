import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			sc.nextLine();

			StringTokenizer st1 = new StringTokenizer(sc.nextLine());
			StringTokenizer st2 = new StringTokenizer(sc.nextLine());
			double e = sc.nextDouble();

			int[][] idx = new int[n][2];
			for (int i = 0; i < n; i++) {
				idx[i][0] = Integer.parseInt(st1.nextToken());
				idx[i][1] = Integer.parseInt(st2.nextToken());
			}

			double[][] matrix = new double[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					matrix[i][j] = matrix[j][i] = Math
							.sqrt(Math.pow(idx[i][0] - idx[j][0], 2) + Math.pow(idx[i][1] - idx[j][1], 2));

				}
			}

			double[][] prim = new double[n][2];
			for (int i = 0; i < n; i++) {
				prim[i][1] = Double.MAX_VALUE;
			}

			prim[0][1] = 0;
			double result = 0;
			for (int i = 0; i < n; i++) {
				int index = -1;
				double min = Double.MAX_VALUE;

				for (int j = 0; j < n; j++) {
					if (prim[j][0] == 0 && prim[j][1] < min) {
						min = prim[j][1];
						index = j;
					}
				}

				prim[index][0] = 1;
				result += Math.pow(prim[index][1], 2);

				for (int j = 0; j < n; j++) {
					if (prim[j][0] == 0 && matrix[index][j] != 0 && prim[j][1] > matrix[index][j]) {
						prim[j][1] = matrix[index][j];
					}
				}
			}
			System.out.printf("#%d %d\n", t, Math.round(result * e));
		}
		sc.close();
	}
}