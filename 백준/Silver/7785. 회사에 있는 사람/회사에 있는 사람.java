import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine(); // 개행문자 처리
		// TreeMap을 사용하여 사용자 이름을 키로, 상태를 값으로 저장
		// TreeMap은 순서가 저장되기 때문에 역순으로 설정한다.
		Map<String, Boolean> map = new TreeMap<>(Comparator.reverseOrder());
		for (int i = 0; i < len; i++) {
			String[] input = sc.nextLine().split(" ");
			String userName = input[0];
			Boolean isEnter = input[1].equals("enter");
			// TreeMap에 사용자 이름과 상태저장. 이미 존재한다면 새로운 값으로 갱신된다.
			map.put(userName, isEnter);
		}
		for (Map.Entry<String, Boolean> entry : map.entrySet()) {
			if (entry.getValue() == true) {
				System.out.println(entry.getKey());
			}
		}
		sc.close();
	}
}