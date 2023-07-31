import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < num; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.printf("%d %d", arr[num - 1], num - 2);

		sc.close();
	}
}
