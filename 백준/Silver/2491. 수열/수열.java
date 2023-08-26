import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 0;
		int tempI = 1; // 연속 증가 수열
		int tempD = 1; // 연속 감소 수열
		for (int i = 1; i < len; i++) {
			if (arr[i - 1] < arr[i]) { // 증가하는 경우
				tempI++;
				result = Math.max(result, tempD); // 감소수열 갱신 후 초기화
				tempD = 1;
			} else if (arr[i - 1] > arr[i]) { // 감소하는 경우
				tempD++;
				result = Math.max(result, tempI); // 증가수열 갱신 후 초기화
				tempI = 1;
			} else {
				tempI++;
				tempD++;
			}
		}
		result = Math.max(result, tempD);
		result = Math.max(result, tempI);
		System.out.println(result);
		sc.close();
	}
}