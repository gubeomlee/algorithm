import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거

		Map<String, Boolean> nMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			nMap.put(sc.nextLine(), true);
		}
		int result = 0;
		for (int i = 0; i < m; i++) {
			if (nMap.getOrDefault(sc.nextLine(), false)) {
				result++;
			}
		}
		System.out.println(result);
		sc.close();
	}
}