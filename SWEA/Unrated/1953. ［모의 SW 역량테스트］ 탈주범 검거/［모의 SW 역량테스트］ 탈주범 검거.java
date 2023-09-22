import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int bfs(int[][] matrix, int n, int m, int r, int c, int cnt) {
		// 파이프 번호별 이동방향을 저장한다.
		Map<Integer, int[][]> direction = new HashMap<>();
		direction.put(1, new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } });
		direction.put(2, new int[][] { { 1, 0 }, { -1, 0 } });
		direction.put(3, new int[][] { { 0, 1 }, { 0, -1 } });
		direction.put(4, new int[][] { { -1, 0 }, { 0, 1 } });
		direction.put(5, new int[][] { { 1, 0 }, { 0, 1 } });
		direction.put(6, new int[][] { { 0, -1 }, { 1, 0 } });
		direction.put(7, new int[][] { { 0, -1 }, { -1, 0 } });

		// 현재 위치를 큐에 추가한다.
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] { r, c });

		boolean[][] visited = new boolean[n][m];
		while (cnt > 0) {
			cnt--; // 매 순회 시 카운트한다.
			int queSize = que.size(); // 현재 큐만큼만 순회
			for (int i = 0; i < queSize; i++) {
				int[] cur = que.poll();
				if (!visited[cur[0]][cur[1]]) { // 방문하지 않은 곳만 탐색한다.
					visited[cur[0]][cur[1]] = true; // 방문표시 한다.
					for (int[] dir : direction.get(matrix[cur[0]][cur[1]])) { // 현재 파이프에서 이동 가능한 방향을 탐색한다.
						int row = cur[0] + dir[0];
						int col = cur[1] + dir[1];
						// 범위 내에 있고, 해당 위치가 파이프인 경우
						if (0 <= row && row < n && 0 <= col && col < m && matrix[row][col] != 0) {
							for (int[] nextDir : direction.get(matrix[row][col])) {
								// 현재 파이프와 다음 파이프가 이동 가능한 경우만 큐에 추가한다.
								if (dir[0] + nextDir[0] == 0 && dir[1] + nextDir[1] == 0) {
									que.add(new int[] { row, col });
								}
							}
						}
					}
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visited[i][j]) {
					sum++;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int r = sc.nextInt();
			int c = sc.nextInt();
			int cnt = sc.nextInt();

			int[][] matrix = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			System.out.printf("#%d %d\n", t, bfs(matrix, n, m, r, c, cnt));
		}
		sc.close();
	}
}