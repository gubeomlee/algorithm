import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void backtrack(List<Integer> arr, int depth, Deque<Integer> temp, List<Deque<Integer>> result) {
		if (depth == 0) {
			result.add(new LinkedList<>(temp));
		} else {
			for (int i = 0; i < arr.size(); i++) {
				// 숫자를 선택하고, 선택한 숫자를 제외한 나머지 숫자들의 리스트를 만든다.
				List<Integer> subList = new ArrayList<Integer>(arr.subList(0, i));
				subList.addAll(arr.subList(i + 1, arr.size()));
				temp.add(arr.get(i)); // 선택한 숫자를 temp에 추가한다.
				backtrack(subList, depth - 1, temp, result);
				temp.pollLast(); // 백트래킹
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {
			arr.add(i);
		}

		List<Deque<Integer>> result = new ArrayList<>();
		backtrack(arr, m, new LinkedList<>(), result);

		for (Deque<Integer> que : result) {
			StringBuilder sb = new StringBuilder();
			for (int num : que) {

				sb.append(num + " ");
			}
			System.out.println(sb);
		}
		sc.close();
	}
}
