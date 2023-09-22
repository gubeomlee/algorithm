import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int v = sc.nextInt();
			int e = sc.nextInt();

			int[][] matrix = new int[v + 1][v + 1];
			int[] cnt = new int[v + 1]; // 진입차수를 저장한다.
			for (int i = 0; i < e; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				matrix[from][to] = 1;
				cnt[to]++;
			}

			Queue<Integer> que = new LinkedList<>();

			// 진입차수가 0인 노드를 큐에 넣는다.
			for (int i = 1; i <= v; i++) {
				if (cnt[i] == 0) {
					que.add(i);
				}
			}

			System.out.printf("#%d ", t);
			while (!que.isEmpty()) {
				int cur = que.poll();
				System.out.printf("%d ", cur);
				for (int i = 1; i <= v; i++) {
					if (matrix[cur][i] == 1) { // 노드가 연결된 경우 
						matrix[cur][i] = 0; // 방문처리하고 
						cnt[i]--; // 진입차수를 감소시킨다. 
						if (cnt[i] == 0) // 진입차수가 0이되면 큐에 넣는다. 
							que.add(i);
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}