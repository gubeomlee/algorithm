import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 문제풀이 우선순위를 입력받아 인접리스트를 만든다.
		List<Integer>[] adj = new ArrayList[n + 1];
		int[] cntArr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adj[from].add(to);
			cntArr[to]++;
		}
		// 쉬운 문제부터 풀어야 하기때문에 우선순위 큐를 활용한다.
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});

		for (int i = 1; i <= n; i++) {
			if (cntArr[i] == 0) {
				que.add(i);
			}
		}

		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int i = 0; i < adj[cur].size(); i++) {
				// 먼저 풀어야 하는 문제를 풀었을 경우 다음문제의 진입차수를 갱신한다.
				if (cntArr[adj[cur].get(i)] != 0) {
					cntArr[adj[cur].get(i)]--;
				}
				// 진입차수가 0이 되면 큐에 추가한다.
				if (cntArr[adj[cur].get(i)] == 0) {
					que.add(adj[cur].get(i));
				}
			}
			System.out.print(cur + " ");
		}
		sc.close();
	}
}