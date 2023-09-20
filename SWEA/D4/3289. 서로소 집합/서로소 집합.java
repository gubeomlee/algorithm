import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static int findSet(int[] set, int num) {
		if (set[num] != num) {
			set[num] = findSet(set, set[num]);
		}
		return set[num];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			StringBuilder sb = new StringBuilder();

			int[] set = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				set[i] = i;
			}

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int com = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if (com == 0) {
					set[findSet(set, Math.max(x, y))] = findSet(set, Math.min(x, y));
				} else {
					int num = 0;
					if (findSet(set, x) == findSet(set, y)) {
						num = 1;
					}
					sb.append(num);
				}
			}
			System.out.printf("#%d %s\n", t, sb.toString());
		}
		br.close();
	}
}