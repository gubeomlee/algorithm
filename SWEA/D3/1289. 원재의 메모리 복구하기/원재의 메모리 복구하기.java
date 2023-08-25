import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			char[] arr = sc.next().toCharArray();

			int result = 0; // 결과값
			for (int i = 0; i < arr.length; i++) {
				if (result != 0 && arr[i] != arr[i - 1]) { // 이전값과 다른 값이 나왔을 때
					result += 1;
				}
				if (result == 0 && arr[i] == '1') { // 첫번째 1을 만날 때
					result = 1;
				}
			}
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}