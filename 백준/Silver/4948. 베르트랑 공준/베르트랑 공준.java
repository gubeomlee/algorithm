import java.util.Scanner;

public class Main {
	// 에라토스테네스의 체 알고리즘을 이용해 소수를 구한다.
	public static boolean[] sieve_of_eratosthenes(int num) {
		boolean[] arr = new boolean[num + 1];
		arr[1] = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (!arr[i]) {
				// 소수 i의 배수를 제거한다.
				for (int j = i * i; j <= num; j += i) {
					arr[j] = true;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			boolean[] result = sieve_of_eratosthenes(num * 2);
			int cnt = 0;
			for (int i = num + 1; i <= num * 2; i++) {
				if (!result[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
