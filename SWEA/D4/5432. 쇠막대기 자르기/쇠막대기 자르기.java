import java.util.Scanner;
import java.util.Stack;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			String input = sc.next();

			Stack<Character> stack = new Stack<>();
			int result = 0;
			int cnt = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '(') {
					cnt++; // 쇠막대 숫자 증가
				} else {
					cnt--; // 쇠막대 숫자 감소
					if (stack.peek() == '(') {
						result += cnt; // 레이저 절단
					} else {
						result++; // 레이저 절단하고 남은 나머지 쇠막대
					}
				}
				stack.add(input.charAt(i));
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}