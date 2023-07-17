import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Solution {
	// 부모 노드를 탐색하여 공통조상을 반환하는 메서드 
	public static ArrayList<Integer> getParentNodes(Map<Integer, Integer> tree, int vertex) {
		ArrayList<Integer> parents = new ArrayList<>();
		while (vertex != 1) {
			parents.add(tree.get(vertex));
			vertex = tree.get(vertex);
		}
		return parents;
	}
	// 어떤 노드의 자식노드 개수를 반환하는 메서드 
	public static int getChildrenSum(Map<Integer, ArrayList<Integer>> tree, int vertex) {
		int sum = 1;
		Queue<Integer> deque = new ArrayDeque<>();
		deque.offer(vertex);
		while (!deque.isEmpty()) {
			int cur = deque.poll();
			ArrayList<Integer> children = tree.get(cur);
			if (children != null) {
				for (int child : children) {
					deque.offer(child);
					sum++;
				}
			}
		}
		return sum;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int vertex = sc.nextInt();
			int edge = sc.nextInt();
			int vertex1 = sc.nextInt();
			int vertex2 = sc.nextInt();
			Map<Integer, Integer> parentsTree = new HashMap<>();
			Map<Integer, ArrayList<Integer>> childrenTree = new HashMap<>();

			for (int i = 0; i < edge; i++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();
				parentsTree.put(child, parent); // 자식노드의 부모노드 정보 저장 
				childrenTree.computeIfAbsent(parent, key -> new ArrayList<>()).add(child); // 부모노드의 자식노드 정보 저장 
			}
			// 각각의 노드에 대해 부모노드 탐색 
			ArrayList<Integer> v1Parents = getParentNodes(parentsTree, vertex1);
			ArrayList<Integer> v2Parents = getParentNodes(parentsTree, vertex2);
			// 두 노드의 공통 조상 탐색 
			int parent_vertex = 0;
			for (int v1 : v1Parents) {
				if (v2Parents.contains(v1)) {
					parent_vertex = v1;
					break;
				}
			}
			// 공통조상의 자식 노드 개수 계
			int sum = getChildrenSum(childrenTree, parent_vertex);

			System.out.printf("#%d %d %d\n", test_case, parent_vertex, sum);
		}
		sc.close();
	}
}