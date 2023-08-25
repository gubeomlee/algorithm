import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			char[] arr = sc.next().toCharArray();

			int result = 0; // 결과값
			int temp = 0; // 임시값
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '1' && result == 0) { // 첫번째 1을 만날 때
					result = 1;
				}
				if (arr[i] == '1' && result != 0) { // 0다음 연속된 1이 나오는 경우
					result += temp;
					temp = 0;
				}
				if (arr[i] == '0' && result != 0) { // 0이 나온경우 
					temp = 2;
				}
			}
			if (temp != 0) { // 0으로 끝난 경우
				result++;
			}
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}