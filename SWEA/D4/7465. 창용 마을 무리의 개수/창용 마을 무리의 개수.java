import java.util.ArrayList;
import java.util.Scanner;

class Solution {
	public static void dfs(ArrayList<ArrayList<Integer>> matrix, boolean[] is_checked, int node) {
		is_checked[node] = true; //현재 노드 방문 처리 
		// 현재 노드와 연결된 노드들에 대해 재귀적으로 방문 
		for (int adjacentNode : matrix.get(node)) {
			if (!is_checked[adjacentNode]) {
				dfs(matrix, is_checked, adjacentNode);
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt(); // 노드의 개수 
			int m = sc.nextInt(); // 간선의 개수 
			
			ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(); // 인접 리스트 그래프 
			for (int i = 0; i <= n; i++) {
				matrix.add(new ArrayList<Integer>());
			}
			// 간선 정보 입력 및 인접 리스트 그래프 구성 
			for (int i = 0; i < m; i++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				matrix.get(num1).add(num2);
				matrix.get(num2).add(num1);
			}

			boolean[] is_ckecked = new boolean[n + 1];

			int result = 0;
			for (int i = 1; i <= n; i++) {
				if (!is_ckecked[i]) {
					result++;
					dfs(matrix, is_ckecked, i);
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}