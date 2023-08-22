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
			int m = sc.nextInt(); // 삽입 연산의 개수
			for (int i = 0; i < m; i++) {
				sc.next(); // 구분 문자열 제거
				int idx = sc.nextInt(); // 삽입위치 인덱스
				int len = sc.nextInt(); // 삽입 요소 개수
				for (int j = idx; j < idx + len; j++) {
					list.add(j, sc.nextInt()); // 삽입 위치 요소 추가
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