import java.util.Scanner;

public class Solution {
	// 길이가 3인 사이클 찾는 메서드 
	public static void dfs(int[][] matrix, int startNode, int node, int cnt, int[] result) {
		if (cnt == 3 && matrix[startNode][node] == 1) { // 길이가 3인 사이클을 찾은 경우 
			result[0]++;
		} else {
			// 현재 노드 다음 노드부터 탐색 
			for (int i = node + 1; i < matrix.length; i++) {
				if (startNode == 0) { // 시작 노드가 지정되지 않은 경우 
					dfs(matrix, i, i, cnt + 1, result);
				} else if ((cnt < 4 && matrix[i][node] == 1)) { // 다음 노드로 진행 
					dfs(matrix, startNode, i, cnt + 1, result);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[][] matrix = new int[n + 1][n + 1];
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				matrix[x][y] = matrix[y][x] = 1;
			}

			int[] result = { 0 };
			dfs(matrix, 0, 0, 0, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}