import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static int setFind(int[] set, int num) {
		if (set[num] != num) {
			set[num] = setFind(set, set[num]);
		}
		return set[num];
	}

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

			// 간선 가중치를 구한다.
			int temp = 0;
			double[][] node = new double[(n * n - n) / 2][3];
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					node[temp][0] = i;
					node[temp][1] = j;
					node[temp++][2] = Math
							.sqrt(Math.pow(idx[i][0] - idx[j][0], 2) + Math.pow(idx[i][1] - idx[j][1], 2));
				}
			}
			// 가중치를 기준으로 정렬한다.
			Arrays.sort(node, new Comparator<double[]>() {
				@Override
				public int compare(double[] o1, double[] o2) {
					return Double.compare(o1[2], o2[2]);
				}
			});

			double result = 0;

			int[] set = new int[(n * n - n) / 2 + 1];
			for (int i = 0; i <= (n * n - n) / 2; i++) {
				set[i] = i;
			}

			for (int i = 0; i < (n * n - n) / 2; i++) {
				if (setFind(set, (int) node[i][0]) != setFind(set, (int) node[i][1])) {
					result += Math.pow(node[i][2], 2);
					set[setFind(set, (int) node[i][1])] = setFind(set, (int) node[i][0]);
				}
			}

			System.out.printf("#%d %d\n", t, Math.round(result * e));
		}
		sc.close();
	}
}