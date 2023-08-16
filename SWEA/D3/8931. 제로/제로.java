import java.util.Scanner;
import java.util.Stack;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < len; i++) {
				int num = sc.nextInt();
				if (num != 0) {
					stack.add(num); // 스택에 숫자 추가
				} else if (!stack.isEmpty()) {
					stack.pop(); // 스택의 top 제거
				}
			}
			
			int result = 0;
			for (int num : stack) {
				result += num;
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}