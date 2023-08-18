import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					// 합을 키로 하고, 합을 키로 갖는 엔트리 값을 증가시킨다.
					map.putIfAbsent(i + j, 0);
					map.put(i + j, map.get(i + j) + 1);
				}
			}

			Queue<Integer> que = new LinkedList<>();
			que.offer(2);
			for (int i = 3; i <= n + m; i++) {
				if (map.get(que.peek()) < map.get(i)) {
					// 기존 큐를 비우고 더 큰 값을 큐에 추가한다.
					que.clear();
					que.offer(i);
				} else if (map.get(que.peek()) == map.get(i)) {
					// 값이 같다면 큐에 추가한다.
					que.offer(i);
				}
			}

			System.out.printf("#%d ", test_case);
			for (int num : que) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
		sc.close();
	}
}