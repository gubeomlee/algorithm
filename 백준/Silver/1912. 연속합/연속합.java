import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int result = sc.nextInt();
		int temp = result;
		for (int i = 1; i < len; i++) {
			int num = sc.nextInt();
			// 현재까지 부분합과 다음 원소를 더한값을 다음 원소와 비교한다.
			temp = Math.max(temp + num, num);
			// 현재까지 최대 부분합을 갱신한다.
			result = Math.max(result, temp);
		}
		System.out.println(result);
		sc.close();
	}
}