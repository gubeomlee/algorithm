import java.util.Scanner;

class Main {
	// 유클리드 호재법을 이용하여 최대공약수 구함.
	public static long gcd(long numA, long numB) {
		if (numB == 0) {
			return numA;
		} else {
			return gcd(numB, numA % numB);
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		long numA = sc.nextLong();
		long numB = sc.nextLong();

		long result = numA * numB / gcd(numA, numB);
		System.out.println(result);
		sc.close();
	}
}