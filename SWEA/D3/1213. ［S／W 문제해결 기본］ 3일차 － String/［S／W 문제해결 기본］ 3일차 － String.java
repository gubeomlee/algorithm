import java.util.Scanner;

class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt();
			String test = sc.next();
			String str = sc.next();

			int result = 0;
			for (int i = 0; i <= str.length() - test.length(); i++) {
				int j;
				for (j = 0; j < test.length(); j++) { // 패턴 순회
					if (str.charAt(i + j) != test.charAt(j)) {
						break; // 불일치하면 중단
					}
				}
				if (test.length() == j) { // 패턴과 문자열이 일치하면 
					result++; // 결고값을 증가
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}