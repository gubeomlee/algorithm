import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Solution {
	// 유효한 좌표인지 확인하는 메서드
	private static boolean isValid(int row, int col, int len) {
		return 0 <= row && row < len && 0 <= col && col < len;
	}

	// 더 짧은 경로인지 확인하는 메서드
	private static boolean isShorterPath(int[][] matrix, int[][] visited, int[] cur, int row, int col) {
		return visited[cur[0]][cur[1]] + matrix[row][col] < visited[row][col];
	}

	public static int bfs(int[][] matrix, int len) {
		int[][] visited = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		visited[0][0] = 0;

		Queue<int[]> deque = new ArrayDeque<>();
		deque.offer(new int[] { 0, 0 });

		int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

		while (!deque.isEmpty()) {
			int[] cur = deque.poll();
			for (int[] dir : direction) {
				int row = cur[0] + dir[0];
				int col = cur[1] + dir[1];
				if (isValid(row, col, len) && isShorterPath(matrix, visited, cur, row, col)) {
					deque.offer(new int[] { row, col }); // 더 짧은 유효한 경로일 때 큐에 추가하여 탐색한다.
					visited[row][col] = visited[cur[0]][cur[1]] + matrix[row][col];
				}
			}
		}
		return visited[len - 1][len - 1];
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine(); // nextInt로 입력받은 다음 nextLine으로 입력받기 위해서는 개행문자를 제거해주어야 한다.
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			sc.nextLine(); // 개행문자 제거
			int[][] matrix = new int[len][len];
			for (int i = 0; i < len; i++) {
				String input = sc.nextLine(); // 경로가 공백없이 입력되어 문자열로 입력받은 후 숫자로 바꿔줘야 한다.
				for (int j = 0; j < len; j++) {
					matrix[i][j] = input.charAt(j) - '0';
				}
			}

			int result = bfs(matrix, len);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}