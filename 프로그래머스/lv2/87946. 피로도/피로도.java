import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void backtrack(int[][] matrix, List<Integer> list, int k, int cnt, int depth, int[] result) {
		if (k < 0) {
			result[0] = Math.max(result[0], cnt - 1);
		} else if (depth == 0) {
			result[0] = Math.max(result[0], cnt);
		} else {
			for (int i = 0; i < list.size(); i++) {
				List<Integer> subList = new ArrayList<>(list.subList(0, i));
				subList.addAll(list.subList(i + 1, list.size()));
				if (k >= matrix[list.get(i)][0]) {
					backtrack(matrix, subList, k - matrix[list.get(i)][1], cnt + 1, depth - 1, result);
				} else {
					result[0] = Math.max(result[0], cnt);
				}
			}
		}
	}

	public static int solution(int k, int[][] dungeons) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < dungeons.length; i++) {
			list.add(i);
		}
		int[] result = { 0 };
		backtrack(dungeons, list, k, 0, dungeons.length, result);

		return result[0];
	}
}