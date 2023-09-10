import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void backtrack(int[] info, Map<Integer, List<Integer>> parentToChildren, List<Integer> list, int node,
			int sheep, int wolf, int[] result) {
		if (sheep > wolf || node == 0) {
			result[0] = Math.max(result[0], sheep); // 결과값 갱신
			// 자식 노드가 없고 늑대면 멈춤
			if (info[node] == 1 && !parentToChildren.containsKey(node)) {
			} else {
				List<Integer> testList = new ArrayList<>(list);
				// 현재 노드의 자식 노드를 testList에 추가
				if (parentToChildren.containsKey(node))
					for (int nextNode : parentToChildren.get(node))
						testList.add(nextNode);

				for (int i = 0; i < testList.size(); i++) {
					int temp = testList.get(i);
					testList.remove(i);
					backtrack(info, parentToChildren, testList, temp, sheep + (info[temp] ^ 1), wolf + info[temp],
							result);
					testList.add(i, temp);
				}
			}
		}
	}

	public static int solution(int[] info, int[][] edges) {
		Map<Integer, List<Integer>> parentToChildren = new HashMap<>();

		for (int i = 0; i < edges.length; i++) {
			parentToChildren.putIfAbsent(edges[i][0], new ArrayList<>());
			parentToChildren.get(edges[i][0]).add(edges[i][1]);
		}

		int[] result = { 0 };
		backtrack(info, parentToChildren, new LinkedList<>(), 0, 1, 0, result);
		return result[0];
	}
}