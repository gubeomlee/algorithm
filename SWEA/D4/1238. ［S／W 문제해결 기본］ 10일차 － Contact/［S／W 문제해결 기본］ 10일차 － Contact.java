import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			int node = sc.nextInt();

			int[][] matrix = new int[101][101];
			for (int i = 0; i < len / 2; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				matrix[from][to] = 1;
			}
			boolean[] visited = new boolean[101];
			List<Integer> result = new ArrayList<>();
			Queue<Integer> que = new LinkedList<>();
			que.add(node);

			while (!que.isEmpty()) {
				result.clear(); // 결과 리스트를 초기화 하고
				result.addAll(que); // 큐의 내용을 결과에 추가한다.
				int n = que.size();
				for (int i = 0; i < n; i++) {
					int cur = que.poll();
					for (int j = 0; j < 101; j++) {
						if (matrix[cur][j] == 1 && !visited[j]) {
							que.add(j);
							visited[j] = true; // 방문 처리한다.
						}
					}
				}
			}
			Collections.sort(result, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
			System.out.printf("#%d %d\n", t, result.get(0));
		}
		sc.close();
	}
}