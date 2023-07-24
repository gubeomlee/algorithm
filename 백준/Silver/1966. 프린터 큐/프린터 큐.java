import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test_case = 0; test_case < t; test_case++) {
			int len = sc.nextInt();
			int idx = sc.nextInt();

			Queue<Integer> que = new ArrayDeque<>();
			for (int i = 0; i < len; i++) {
				que.add(sc.nextInt());
			}

			int result = 0;
			while (true) {
				int maxNum = Integer.MIN_VALUE;
				for (int num : que) {
					maxNum = Math.max(maxNum, num);
				}
				
				if (idx == 0 && que.peek() == maxNum) { // 큐의 맨 앞 요소가 찾고자 하는 요소이고 최댓값인 경우 
					System.out.println(++result);
					break;
				} else if (que.peek() == maxNum) { // 큐의 맨 앞 요소가 최댓값인 경우 
					result++;
					idx--;
					que.poll();
				} else { // 큐의 맨 앞 요소가 최댓값이 아닌 경우 
					que.add(que.poll());
					if (idx == 0) { // 큐의 맨 앞 요소가 찾고자 하는 요소인 경우 
						idx = que.size() - 1;
					} else {
						idx--;
					}
				}
			}
		}
		sc.close();
	}
}