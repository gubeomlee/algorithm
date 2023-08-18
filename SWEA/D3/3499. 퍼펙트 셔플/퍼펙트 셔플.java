import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			// 2개 큐에 나눠서 입력 받는다.
			Queue<String> que1 = new LinkedList<>();
			Queue<String> que2 = new LinkedList<>();
			Queue<String> result = new LinkedList<>();
			// 첫번째 큐는 문자열 홀수, 짝수를 구분하여 입력받는다.
			if (len % 2 != 0) {
				for (int i = 0; i < len / 2 + 1; i++) {
					que1.offer(sc.next());
				}
			} else {
				for (int i = 0; i < len / 2; i++) {
					que1.offer(sc.next());
				}
			}
			for (int i = 0; i < len / 2; i++) {
				que2.offer(sc.next());
			}
			// 두 큐에서 하나씩 빼서 결과 큐에 추가한다.
			for (int i = 0; i < len / 2; i++) {
				result.offer(que1.poll());
				result.offer(que2.poll());
			}
			// 문자열이 홀수로 주어진 경우 첫번째 큐의 값을 결과 큐에 추가한다.
			if (len % 2 != 0) {
				result.offer(que1.poll());
			}

			System.out.printf("#%d ", test_case);
			for (String str : result) {
				System.out.printf("%s ", str);
			}
			System.out.println();
		}
		sc.close();
	}
}
