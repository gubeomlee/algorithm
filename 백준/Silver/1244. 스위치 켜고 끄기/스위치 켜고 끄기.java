import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int[] arr = new int[len + 1]; // 문자의 인덱스가 1부터 시작하게 때문에 배열의 길이를 1 늘린다.
		for (int i = 1; i <= len; i++) {
			arr[i] = sc.nextInt();
		}

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int s = sc.nextInt();
			int num = sc.nextInt();

			if (s == 1) {
				for (int i = num; i <= len; i += num) {
					arr[i] ^= 1;
				}
			} else {
				arr[num] ^= 1;
				int maxLen = Math.min(num - 1, len - num); // 대칭 위치의 최대 거리
				for (int i = 1; i <= maxLen; i++) {
					if (arr[num - i] == arr[num + i]) {
						arr[num - i] ^= 1;
						arr[num + i] ^= 1;
					} else {
						break;
					}
				}
			}
		}
		for (

				int i = 1; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
			if (i % 20 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}
}