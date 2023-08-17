import java.util.Stack;

public class Solution {
	public static void getVisitedCnt(String name, int idx, int[] result) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < idx; i++) {
			stack.add(name.charAt(i));
		}
		for (int i = idx - 2; i >= 0; i--) {
			stack.add(name.charAt(i));
		}
		for (int i = name.length() - 1; i >= idx; i--) {
			stack.add(name.charAt(i));
		}
		while (stack.peek() == 'A') {
			stack.pop();
		}
		int cnt = stack.size() - 1;
		if (idx == 0 && name.charAt(0) == 'A') {
			cnt++;
		}

		result[0] = Math.min(result[0], cnt);
	}

	public static int joystick(String name) {
		int result = 0;
		for (int i = 0; i < name.length(); i++) {
			result += Math.min(name.charAt(i) - 'A', 26 - name.charAt(i) + 'A');
		}
		return result;
	}

	public static int solution(String name) {
		int joystickResult = joystick(name);

		int[] result = { name.length() };

		if (joystickResult == 0) {
			result[0] = 0;
		} else {
			for (int i = 0; i < name.length(); i++) {
				if (i == 0 || name.charAt(i) == 'A') {
					getVisitedCnt(name, i, result);
				}
			}

			StringBuilder sb = new StringBuilder();
			sb.append(name.charAt(0));
			for (int i = name.length() - 1; i >= 1; i--) {
				sb.append(name.charAt(i));
			}

			for (int i = 0; i < name.length(); i++) {
				if (i == 0 || sb.toString().charAt(i) == 'A') {
					getVisitedCnt(sb.toString(), i, result);
				}
			}
		}
		return joystickResult + result[0];
	}
}