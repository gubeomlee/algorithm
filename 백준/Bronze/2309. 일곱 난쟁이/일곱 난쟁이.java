import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		Integer[] arr = new Integer[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += arr[i];
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i != j && sum - arr[i] - arr[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (k != i && k != j) {
							System.out.println(arr[k]);
						}
					}
					return;
				}
			}
		}

		sc.close();
	}
}