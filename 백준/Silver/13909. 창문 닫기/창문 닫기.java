import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 마지막에 창문이 열려 있기 위해서는 약수의 개수가 홀수여야 한다. 
		// 약수의 개수가 홀수이기 위해서는 제곱수여야 한다.
		// n보다 작은 제곱수의 개수는 n의 제곱근의 정수값이다. 
		System.out.println((int) Math.sqrt(sc.nextLong()));
		sc.close();
	}
}
