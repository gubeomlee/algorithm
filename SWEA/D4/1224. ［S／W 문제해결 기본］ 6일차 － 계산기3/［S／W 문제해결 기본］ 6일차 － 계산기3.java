import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Solution {
	// 후위 표기법으로 변환하는 메서드
	public static String getPostfixNotaion(int len, String str) {
		// 연산자 우선순위 저장하는 맵
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('*', 1);
		priority.put('/', 1);
		priority.put('+', 2);
		priority.put('-', 2);
		priority.put('(', 3);

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				// 피연산자인 경우 출력한다.
				sb.append(str.charAt(i));
			} else if (stack.isEmpty() || str.charAt(i) == '(') {
				// 스택이 비어있거나 왼쪽 괄호인 경우
				stack.add(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				// 오른쪽 괄호인 경우
				while (!stack.isEmpty() && stack.peek() != '(') {
					// 왼쪽 괄호가 나올 때까지 스택을 출력한다.
					sb.append(stack.pop());
				}
				stack.pop();
			} else {
				// 연산자인 경우 우선순위를 비교하여 스택의 값을 출력한다.
				while (!stack.isEmpty() && priority.get(stack.peek()) <= priority.get(str.charAt(i))) {
					sb.append(stack.pop());
				}
				stack.add(str.charAt(i));
			}
		}
		// 스택에 남아있는 값을 출력한다.
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	// 후위 표기식을 계산하는 메서드
	public static int calculatePostfixNotation(String str) {
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				// 피연산자인 경우 스택에 추가한다.
				stack.add(String.valueOf(str.charAt(i)));
			} else {
				// 연산자인 경우 스택에서 숫자를 꺼내 계산하고, 스택에 결과를 추가한다.
				int num2 = Integer.parseInt(stack.pop());
				int num1 = Integer.parseInt(stack.pop());
				if (str.charAt(i) == '+') {
					stack.add(String.valueOf(num1 + num2));
				} else if (str.charAt(i) == '-') {
					stack.add(String.valueOf(num1 - num2));
				} else if (str.charAt(i) == '*') {
					stack.add(String.valueOf(num1 * num2));
				} else if (str.charAt(i) == '/') {
					stack.add(String.valueOf(num1 / num2));
				}
			}
		}
		return Integer.parseInt(stack.pop());
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			String str = sc.next();
			String postfixNoation = getPostfixNotaion(len, str);
			int result = calculatePostfixNotation(postfixNoation);
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}