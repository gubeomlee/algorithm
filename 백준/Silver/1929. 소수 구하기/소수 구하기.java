import java.util.Scanner;

public class Main {
	// 에라토스테네스의 체 알고리즘을 이용해 소수를 구한다.
	public static boolean[] sieve_of_eratosthenes(int end) {
		boolean[] arr = new boolean[end + 1];
		arr[1] = true;
		for (int i = 2; i <= Math.sqrt(end); i++) {
			if (!arr[i]) {
				// 소수 i의 배수를 제거한다.
				for (int j = i * i; j <= end; j += i) {
					arr[j] = true;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		boolean[] result = sieve_of_eratosthenes(end);
		for (int i = start; i <= end; i++) {
			if (!result[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
