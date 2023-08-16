import java.util.Scanner;
import java.util.Stack;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			String input = sc.next();
			Stack<Character> stack = new Stack<>();
			int result = 1;
			for (int i = 0; i < len; i++) {
				if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['
						|| input.charAt(i) == '<') { // 여는 괄호일 때 스택 추가
					stack.add(input.charAt(i));
				} else { // 닫는 괄호일 때
					if (stack.peek() == '(' && input.charAt(i) == ')' || stack.peek() == '{' && input.charAt(i) == '}'
							|| stack.peek() == '[' && input.charAt(i) == ']'
							|| stack.peek() == '<' && input.charAt(i) == '>') {
						stack.pop(); // 짝을 이루는 경우
					} else {
						result = 0; // 짝을 이루지 못하는 경우
						break;
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}