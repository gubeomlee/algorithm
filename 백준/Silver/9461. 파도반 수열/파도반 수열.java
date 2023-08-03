import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test_case = 0; test_case < t; test_case++) {
			long num = sc.nextLong();
			List<Long> arr = new ArrayList<>();
			arr.add(1L);
			arr.add(1L);
			arr.add(1L);
			if (num < 4) {
				System.out.println(arr.get((int) (num - 1)));
			} else {
				// 3 이상인 경우 순차적으로 값을 계산하여 리스트에 추가한다.
				for (int i = 3; i <= num; i++) {
					arr.add(arr.get(i - 2) + arr.get(i - 3));
				}
				System.out.println(arr.get((int) (num - 1)));
			}
		}
		sc.close();
	}
}