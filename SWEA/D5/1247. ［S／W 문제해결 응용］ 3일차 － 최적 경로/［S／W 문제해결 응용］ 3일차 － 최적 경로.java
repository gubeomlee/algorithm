import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class Solution {
	// 두 점 사이의 거리를 계산하는 메서드 
	public static int getLength(ArrayList<Integer> a, ArrayList<Integer> b) {
		return Math.abs(a.get(0) - b.get(0)) + Math.abs(a.get(1) - b.get(1));
	}
	// 백트래킹을 수행하는 메서드 
	public static void backtrack(ArrayList<ArrayList<Integer>> matrix, ArrayList<Integer> start, ArrayList<Integer> end,
			int cnt, Deque<ArrayList<Integer>> temp, int[] result) {
		if (cnt == 0) { // 모든 포인트를 방문하는 temp가 완성된 경우 거리르 계산한다. 
			int temp_sum = 0;
			for (ArrayList<Integer> idx : temp) {
				temp_sum += getLength(start, idx);
				start = idx; // 거리 계산 후 시작점 걩신해 준다. 
			}
			temp_sum += getLength(start, end);
			result[0] = Math.min(result[0], temp_sum);
		} else {
			for (int i = 0; i < cnt; i++) {
				temp.offer(matrix.get(i)); // 아직 방문하지 않은 포인트에대한 반복
				ArrayList<ArrayList<Integer>> temp_matrix = new ArrayList<>();
				for (int j = 0; j < cnt; j++) {
					if (j != i) {
						temp_matrix.add(matrix.get(j));
					}
				}
				backtrack(temp_matrix, start, end, cnt - 1, temp, result);
				temp.pollLast();
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				matrix.add(new ArrayList<>());
			}

			ArrayList<Integer> start = new ArrayList<>();
			start.add(sc.nextInt());
			start.add(sc.nextInt());

			ArrayList<Integer> end = new ArrayList<>();
			end.add(sc.nextInt());
			end.add(sc.nextInt());

			for (int i = 0; i < len; i++) {
				matrix.get(i).add(sc.nextInt());
				matrix.get(i).add(sc.nextInt());
			}

			int[] result = { Integer.MAX_VALUE };
			backtrack(matrix, start, end, len, new ArrayDeque<>(), result);

			System.out.printf("#%d %d\n", test_case, result[0]);
		}
		sc.close();
	}
}