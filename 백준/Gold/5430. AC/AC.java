import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int test_case = 0; test_case < t; test_case++) {
			String com = sc.nextLine();
			int len = sc.nextInt();
			sc.nextLine();
			String input = sc.nextLine();

			Deque<Integer> deque = new LinkedList<>();
			for (int i = 0; i < input.length(); i++) {
				StringBuilder sb = new StringBuilder();
				// 숫자만 추출하여 deque에 추가 
				if (Character.isDigit(input.charAt(i))) {
					while (i < input.length() && Character.isDigit(input.charAt(i))) {
						sb.append(input.charAt(i));
						i++;
					}
					deque.addLast(Integer.parseInt(sb.toString()));
				}
			}

			boolean reverseFlag = true; // 배열 반전시킬지 여부 나타내는 플래그 
			boolean errorFlag = true; // 에러 여부 나타내는 플래그 
 			for (int i = 0; i < com.length(); i++) {
				if (com.charAt(i) == 'R') { // 배열 반전시키는 경우 
					reverseFlag = !reverseFlag;
				} else {
					if (deque.isEmpty()) {
						System.out.println("error"); // 빈 배열에서 'D'연산 수행시킬 때 에러발생 
						errorFlag = false;
						break;
					} else {
						// 'D'연산 수행 
						if (reverseFlag) {
							deque.removeFirst();
						} else {
							deque.removeLast();
						}
					}
				}
			}
 			// 에러가 없는 경우 결과 출력 
			if (errorFlag) {
				StringBuilder sb = new StringBuilder();
				sb.append("[");
				while (!deque.isEmpty()) {
					if (reverseFlag) {
						sb.append(deque.pollFirst());
					} else {
						sb.append(deque.pollLast());
					}
					if (!deque.isEmpty()) {
						sb.append(",");
					}
				}
				sb.append("]");
				System.out.println(sb);
			}
		}
	}
}