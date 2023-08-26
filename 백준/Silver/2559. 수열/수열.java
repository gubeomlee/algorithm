import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int day = sc.nextInt();

		int sum = 0;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
			if (i < day) { // 초기 합
				sum += arr[i];
			}
		}

		int result = sum;
		for (int i = day; i < len; i++) {
			sum -= arr[i - day]; // 앞의 값을 빼고
			sum += arr[i]; // 현재 값을 더한다.
			result = Math.max(result, sum); // 최댓값을 갱신한다.
		}

		System.out.println(result);
		sc.close();
	}
}