import java.util.Scanner;

class Main {
	// 유클리드 호재법을 이용하여 최대공약수 구함.
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int result = lcm(a, b);
			System.out.println(result);
		}
		sc.close();
	}
}