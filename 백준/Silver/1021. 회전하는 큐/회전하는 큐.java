import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		LinkedList<Integer> deque = new LinkedList<>();
		int[] arr = new int[m];

		for (int i = 1; i < n + 1; i++) {
			deque.add(i);
		}
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		int cnt = 0;
		for (int num : arr) {
			while (true) {
				if (num == deque.peekFirst()) {
					deque.removeFirst();
					break;
				} else {
					cnt++; // 맨 앞에 있는 수가 제거 하려는 수가 아닌 경우 회전한다. 
					int idx = deque.indexOf(num);
					if ((deque.size() - 1) / 2 >= idx) { // 제거하려는 수의 인덱스가 중간 인덱스보다 작거나 같은 경우 
						deque.addLast(deque.removeFirst());
					} else { // 제거하려는 수의 인덱스가 중간 인덱스보다 큰 경우 
						deque.addFirst(deque.removeLast());
					}
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}