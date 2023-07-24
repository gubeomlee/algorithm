import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static HashSet<Integer> sieve_of_eratosthenes(int num) {
		boolean[] arr = new boolean[num + 1];
		arr[1] = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (!arr[i]) {
				for (int j = i * i; j < num + 1; j += i) {
					arr[j] = true;
				}
			}
		}
		HashSet<Integer> result = new HashSet<>();
		for (int i = 2; i < num + 1; i++) {
			if (!arr[i]) {
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test_case = 0; test_case < t; test_case++) {
			int num = sc.nextInt();
			HashSet<Integer> primeSet = sieve_of_eratosthenes(num);
			int cnt = 0;
			for (int prime : primeSet) {
				if (primeSet.contains(num - prime)) { // 두 소수가 존재하는 경우
					if (prime == num - prime) { 
						cnt += 2; // 같은 수를 두번 사용하는 경우
					} else {
						cnt += 1; // 서로 다른 수를 사용하는 경우 
					}
				}
			}
			System.out.println(cnt / 2);
		}
		sc.close();
	}
}