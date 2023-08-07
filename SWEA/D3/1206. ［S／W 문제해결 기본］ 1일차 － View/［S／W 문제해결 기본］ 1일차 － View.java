import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int len = sc.nextInt();
			sc.nextLine(); // 개행문자 제거
			int[] arr = new int[len];
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for (int i = 0; i < len; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int result = 0;
			for (int i = 2; i < len - 2; i++) {
				// 현재 위치와 주변 2칸의 높이 중 가장 높은 값을 찾는다.
				int height = Math.max(Math.max(arr[i - 1], arr[i - 2]), Math.max(arr[i + 1], arr[i + 2]));
				if (arr[i] > height) {
					result += arr[i] - height; // 높이 차이만큼 결과에 더한다.
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
		sc.close();
	}
}