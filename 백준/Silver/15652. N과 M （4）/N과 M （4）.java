import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static StringBuilder sb = new StringBuilder();

	public static void backtrack(List<Integer> arr, int depth, Deque<Integer> temp) {
		if (depth == 0) {
			for (int num : temp) {
				sb.append(num + " ");
			}
			sb.append("\n");
		} else {
			for (int i = 0; i < arr.size(); i++) {
				// 숫자를 선택하고, 선택한 숫자 이상의 숫자들의 리스트를 만든다.
				List<Integer> subList = new ArrayList<Integer>(arr.subList(i, arr.size()));
				temp.add(arr.get(i)); // 선택한 숫자를 temp에 추가한다.
				backtrack(subList, depth - 1, temp);
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

		backtrack(arr, m, new LinkedList<>());

		System.out.println(sb);
		sc.close();
	}
}