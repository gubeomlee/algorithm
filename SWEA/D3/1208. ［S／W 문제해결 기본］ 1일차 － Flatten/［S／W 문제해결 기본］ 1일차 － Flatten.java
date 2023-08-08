import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int[] arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			int temp = 0; // 평탄화 작업 저장할 변수
			// 최대높이의 인덱스에서 시작하여 높이를 감소시킨다.
			outerLoop1: while (true) {
				outerLoop2: for (int i = 98; i >= 0; i--) {
					if (arr[i] < arr[99]) { // 현재 높이가 최대 높이보다 작은 경우
						for (int j = i + 1; j < 100; j++) {
							temp++; // 평탄화 작업 수 증가
							arr[j]--; // 평탄화
							if (temp == num) {
								break outerLoop1;
							}
						}
						break outerLoop2;
					}
				}
			}
			// 최소높이의 인덱스에서 시작하여 높이를 증가시킨다.
			outerLoop1: while (true) {
				outerLoop2: for (int i = 1; i < 100; i++) {
					if (arr[i] > arr[0]) { // 현재 높이가 최대 높이보다 큰 경우
						for (int j = i - 1; j >= 0; j--) {
							temp--; // 평탄화 작업 수 감소
							arr[j]++; // 평탄화
							if (temp == 0) {
								break outerLoop1;
							}
						}
						break outerLoop2;
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, arr[99] - arr[0]);
		}
		sc.close();
	}
}