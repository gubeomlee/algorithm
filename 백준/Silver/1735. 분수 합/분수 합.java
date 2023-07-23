import java.util.Scanner;

class Main {
	// 유클리드 호재법을 이용하여 최대공약수 구함.
	public static int gcd(int numA, int numB) {
		if (numB == 0) {
			return numA;
		} else {
			return gcd(numB, numA % numB);
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int numA1 = sc.nextInt();
		int numB1 = sc.nextInt();
		int numA2 = sc.nextInt();
		int numB2 = sc.nextInt();

		int numA = numA1 * numB2 + numA2 * numB1;
		int numB = numB1 * numB2;
		int gcd = gcd(numA, numB);
		System.out.printf("%d %d", numA / gcd, numB / gcd);
		sc.close();
	}
}
