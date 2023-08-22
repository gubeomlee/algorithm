import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				list.addLast(sc.nextInt());
			}
		
			int m = sc.nextInt(); // 연산의 개수 입력
			for (int i = 0; i < m; i++) {
				String com = sc.next(); // 연산 타입 ("I", "D", "A")
				if (com.equals("I")) {
					int idx = sc.nextInt();
					int len = sc.nextInt();
					for (int j = idx; j < idx + len; j++) {
						list.add(j, sc.nextInt()); // 삽입 위치 요소 추가
					}
				} else if (com.equals("D")) {
					int idx = sc.nextInt();
					int len = sc.nextInt();
					for (int j = idx; j < idx + len; j++) {
						list.remove(j); // 삭제 위치에 있는 요소 삭제
					}
				} else if (com.equals("A")) {
					int len = sc.nextInt();
					for (int j = 0; j < len; j++) {
						list.addLast(sc.nextInt()); // 리스트 끝에 요소 추가
					}
				}
			}

			System.out.printf("#%d ", t);
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d ", list.get(i));
			}
			System.out.println();
		}
		sc.close();
	}
}