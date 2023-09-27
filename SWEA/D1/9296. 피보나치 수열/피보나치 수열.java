import java.util.Scanner;

public class Solution {
	public static int fibonacci(int num) {
		if (num < 2) {
			num = 2;
		}
		
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < num; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[num - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 5; t++) {
			int num = sc.nextInt();
			System.out.println(fibonacci(num));
		}
		sc.close();
	}
}