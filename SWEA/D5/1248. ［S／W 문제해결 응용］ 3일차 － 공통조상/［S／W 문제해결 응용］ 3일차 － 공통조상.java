import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	// 특정 노드의 자손노드 개수를 반환하는 메서드
	public static int getChildSum(Map<Integer, List<Integer>> tree, int vertext) {
		int sum = 1;

		Queue<Integer> que = new LinkedList<>();
		que.offer(vertext);

		while (!que.isEmpty()) {
			int cur = que.poll();
			List<Integer> childrenNode = tree.get(cur);
			if (childrenNode != null) {
				for (int child : childrenNode) {
					que.offer(child);
					sum++;
				}
			}
		}
		return sum;
	}

	// 부모노드를 탐색하여 공통조상을 반환하는 메서드
	public static int getParentVertex(Map<Integer, Integer> tree, int target1, int target2) {
		Stack<Integer> target1P = new Stack<>();
		Stack<Integer> target2P = new Stack<>();

		target1P.add(target1);
		target2P.add(target2);
		// 각 노드의 부모노드 탐색
		while (target1P.peek() != 1) {
			target1P.add(tree.get(target1P.peek()));
		}
		while (target2P.peek() != 1) {
			target2P.add(tree.get(target2P.peek()));
		}
		// 공통조상 탐색
		for (int num1 : target1P) {
			for (int num2 : target2P) {
				if (num1 == num2) {
					return num1;
				}
			}
		}
		return 0;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int vertext = sc.nextInt();
			int edge = sc.nextInt();
			int target1 = sc.nextInt();
			int target2 = sc.nextInt();

			Map<Integer, Integer> parentsTree = new HashMap<>();
			Map<Integer, List<Integer>> childrenTree = new HashMap<>();

			for (int i = 0; i < edge; i++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();
				parentsTree.put(child, parent);
				childrenTree.computeIfAbsent(parent, key -> new ArrayList<>()).add(child);
			}

			int parentVertex = getParentVertex(parentsTree, target1, target2);
			int childSum = getChildSum(childrenTree, parentVertex);

			System.out.printf("#%d %d %d\n", t, parentVertex, childSum);
		}
		sc.close();
	}
}