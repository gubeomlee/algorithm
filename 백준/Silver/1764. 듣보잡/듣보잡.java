import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextLine());
		}
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String input = sc.nextLine();
			if (set.contains(input)) {
				result.add(input);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for (String str : result) {
			System.out.println(str);
		}
		sc.close();
	}
}