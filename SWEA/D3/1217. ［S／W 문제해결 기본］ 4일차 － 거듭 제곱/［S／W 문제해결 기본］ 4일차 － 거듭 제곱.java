import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static int pow(int n, int m, Map<Integer, Integer> map) {
		if (map.containsKey(m)) {
			return map.get(m);
		} else {
			if (m % 2 == 0) {
				int num = pow(n, m / 2, map) * pow(n, m / 2, map);
				map.put(m, num);
				return num;
			} else {
				int num = pow(n, (m - 1) / 2, map) * pow(n, (m - 1) / 2, map) * n;
				map.put(m, num);
				return num;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();

			Map<Integer, Integer> map = new HashMap<>();
			map.put(1, n);

			int result = pow(n, m, map);
			System.out.printf("#%d %d\n", t, result);
		}
		sc.close();
	}
}