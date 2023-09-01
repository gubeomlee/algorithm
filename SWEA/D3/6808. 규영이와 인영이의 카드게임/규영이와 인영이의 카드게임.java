import java.util.Scanner;

public class Solution {
	public static void backtrack(int[] arr, int brr[], boolean[] check, int idx, int aPoint, int bPoint, int[] a,
			int[] b) {
		if (idx == 9) { // 경기 종료 후 승점 비교하여 결기 결과 계산
			if (aPoint > bPoint)
				a[0]++;
			else if (aPoint < bPoint)
				b[0]++;
		} else {
			for (int i = 0; i < 9; i++) {
				if (!check[i]) {
					check[i] = true;
					if (arr[idx] > brr[i]) { // 점수 비교해서 재귀 호출
						backtrack(arr, brr, check, idx + 1, aPoint + arr[idx] + brr[i], bPoint, a, b);
					} else if (arr[idx] < brr[i]) {
						backtrack(arr, brr, check, idx + 1, aPoint, bPoint + arr[idx] + brr[i], a, b);
					}
					check[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int[] arr = new int[9];
			int[] brr = new int[9];
			int idx = 0;
			for (int i = 0; i < 9; i++) // 규영이 카드 
				arr[i] = sc.nextInt();
			loop: for (int i = 1; i <= 18; i++) { // 인영이 카드 
				for (int j = 0; j < 9; j++) {
					if (arr[j] == i) {
						continue loop;
					}
				}
				brr[idx++] = i;
			}
			
			int[] a = { 0 };
			int[] b = { 0 };
			backtrack(arr, brr, new boolean[9], 0, 0, 0, a, b);
			System.out.printf("#%d %d %d\n", t, a[0], b[0]);
		}
		sc.close();
	}
}