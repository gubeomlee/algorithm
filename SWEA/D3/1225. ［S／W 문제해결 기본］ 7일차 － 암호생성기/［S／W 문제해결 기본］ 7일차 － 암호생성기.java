import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();

			Queue<Integer> que = new LinkedList<>();
			for (int i = 0; i < 8; i++) {
				que.offer(sc.nextInt());
			}

			loop: while (true) {
				for (int i = 1; i <= 5; i++) {
					if (que.peek() - i <= 0) { // 암호 완성 조건 달성
						que.poll();
						que.offer(0);
						break loop;
					}
					que.offer(que.poll() - i); // 암호 생성 사이클
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
