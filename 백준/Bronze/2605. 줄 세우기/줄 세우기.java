import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= len; i++) {
			int idx = sc.nextInt();
			arr.add(arr.size() - idx, i);
		}

		for (int i = 0; i < len; i++) {
			System.out.printf("%d ", arr.get(i));
		}
		sc.close();
	}
}