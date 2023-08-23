import java.util.Scanner;

public class Solution {
	public static int cal(int num1, int num2, String com) {
		if (com.equals("+")) {
			return num1 + num2;
		} else if (com.equals("-")) {
			return num1 - num2;
		} else if (com.equals("*")) {
			return num1 * num2;
		} else {
			return num1 / num2;
		}
	}

	public static String postorder(String[] arr, int idx, int len, int[] lChild, int[] rChild) {
		// 현재 노드가 연산자인 경우
		if (!Character.isDigit(arr[idx].toCharArray()[0])) {
			// 왼쪽 자식 노드 순회
			int num1 = Integer.parseInt(postorder(arr, lChild[idx], len, lChild, rChild));
			// 오른쪽 자식 노드 순회
			int num2 = Integer.parseInt(postorder(arr, rChild[idx], len, lChild, rChild));
			return Integer.toString(cal(num1, num2, arr[idx]));
		}
		return arr[idx];
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			// 각 노드의 정보 입력 및 저장
			String[] arr = new String[len + 1];
			int[] lChild = new int[len + 1];
			int[] rChild = new int[len + 1];

			for (int i = 1; i <= len; i++) {
				int num = sc.nextInt();
				arr[num] = sc.next();
				// 노드가 연산자인 경우 자식 노드 정보 입력
				if (!Character.isDigit(arr[num].toCharArray()[0])) {
					lChild[i] = sc.nextInt();
					rChild[i] = sc.nextInt();
				}
			}

			String result = postorder(arr, 1, len + 1, lChild, rChild);
			System.out.printf("#%d %s\n", t, result);
		}
		sc.close();
	}
}