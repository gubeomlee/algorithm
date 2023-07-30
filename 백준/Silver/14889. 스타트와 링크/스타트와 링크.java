import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void backtrack(List<Integer> arr, int depth, List<Integer> temp, List<List<Integer>> combination) {
		if (depth == 0) {
			combination.add(new ArrayList<>(temp));
		} else {
			for (int i = 0; i < arr.size(); i++) {
				// link 팀은 차집합으로 구하므로 start 팀을 구할 때는 오름차순으로 구한다. 
				List<Integer> subList = new ArrayList<>(arr.subList(i + 1, arr.size()));
				temp.add(arr.get(i));
				backtrack(subList, depth - 1, temp, combination);
				temp.remove(temp.size() - 1);
			}
		}
	}

	// 두 팀의 능력치 차이를 구하는 메서드
	public static int calculateDifference(int[][] matrix, List<Integer> start, List<Integer> link, int len) {
		int team1 = 0;
		int team2 = 0;
		for (int i = 0; i < len / 2; i++) {
			for (int j = 0; j < len / 2; j++) {
				team1 += matrix[start.get(i)][start.get(j)];
				team2 += matrix[link.get(i)][link.get(j)];
			}
		}
		return Math.abs(team1 - team2);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		int[][] matrix = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			arr.add(i);
		}
		// start 팀만 구하고 link 팀은 차집합으로 구하므로 재귀의 깊이는 len/2로 한다. 
		List<List<Integer>> combination = new ArrayList<>();
		backtrack(arr, len / 2, new ArrayList<>(), combination);

		int result = Integer.MAX_VALUE;
		for (List<Integer> start : combination) {
			// 차집합을 통해 link 팀을 구한다.
			List<Integer> link = new ArrayList<>(arr);
			link.removeAll(start);
			result = Math.min(result, calculateDifference(matrix, start, link, len));
		}

		System.out.println(result);
		sc.close();
	}
}