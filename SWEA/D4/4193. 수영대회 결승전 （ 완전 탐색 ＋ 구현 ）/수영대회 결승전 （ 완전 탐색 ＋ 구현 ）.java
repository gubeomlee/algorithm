import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Solution {
	public static int bfs(int[][] matrix, int len, int start_r, int start_c, int end_r, int end_c) {
		int[][] visited = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				visited[i][j] = Integer.MAX_VALUE;
			}
		}

		int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		Queue<int[]> deque = new ArrayDeque<>();
		deque.offer(new int[] { start_r, start_c });
		visited[start_r][start_c] = 0;

		while (!deque.isEmpty()) {
			int[] cur = deque.poll();

			for (int[] dir : directions) {
				int next_r = cur[0] + dir[0];
				int next_c = cur[1] + dir[1];
				int cur_cnt = visited[cur[0]][cur[1]];
				int next_cnt = visited[next_r][next_c];
				// 빈 칸인 경우 
				if (matrix[next_r][next_c] == 0 && next_cnt > cur_cnt + 1) {
					visited[next_r][next_c] = cur_cnt + 1;
					deque.offer(new int[] { next_r, next_c });
				// 소용돌이가 존재하는 경우 
				} else if (matrix[next_r][next_c] == 2 && next_cnt > cur_cnt + 1) {
					for (int i = 1; i < 4; i++) {
						if ((cur_cnt + i) % 3 == 0 && next_cnt > cur_cnt + i) {
							visited[next_r][next_c] = cur_cnt + i;
							deque.offer(new int[] { next_r, next_c });
						}
					}
				}
			}
		}
		if (visited[end_r][end_c] == Integer.MAX_VALUE) {
			// 목적지에 도달할 수 없는 경우 
			return -1;
		}
		return visited[end_r][end_c];
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			int[][] matrix = new int[len + 2][len + 2];

			for (int i = 0; i < len + 2; i++) {
				// 경계를 벽으로 설정 
				matrix[i][0] = 1;
				matrix[0][i] = 1;
				matrix[i][len + 1] = 1;
				matrix[len + 1][i] = 1;
			}

			for (int i = 1; i <= len; i++) {
				for (int j = 1; j <= len; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			// 경계를 벽으로 설정했기 때문에 좌표값에 1을 더해준다. 
			int start_r = sc.nextInt() + 1;
			int start_c = sc.nextInt() + 1;
			int end_r = sc.nextInt() + 1;
			int end_c = sc.nextInt() + 1;

			int result = bfs(matrix, len + 2, start_r, start_c, end_r, end_c);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}