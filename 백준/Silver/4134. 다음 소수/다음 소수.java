import java.util.Scanner;

public class Main {
	// 주어진 숫자가 소수인지 확인하는 함수
	public static boolean isPrime(long num) {
		if (num <= 1) {
			return false;
		}
		// 제곱근까지만 반복하여 확인
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for (long test_case = 0; test_case < t; test_case++) {
			long num = sc.nextLong();
			while (true) {
				if (isPrime(num)) {
					System.out.println(num);
					break;
				} else {
					num += 1;
				}
			}
		}
		sc.close();
	}
}