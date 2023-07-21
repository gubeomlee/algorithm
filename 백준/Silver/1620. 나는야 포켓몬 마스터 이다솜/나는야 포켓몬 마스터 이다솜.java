import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n]; //포켓몬 이름 저장
		Map<String, Integer> map = new HashMap<>(); // 포켓몬 이름과 인덱스 저장
		for (int i = 0; i < n; i++) {
			String pokemon = sc.nextLine();
			arr[i] = pokemon;
			map.put(pokemon, i + 1);
		}
		for (int i = 0; i < m; i++) {
			String input = sc.nextLine();
			try {
				int num = Integer.parseInt(input); // 입력 받은 값이 숫자인 경우
				System.out.println(arr[num - 1]); // 해당 인덱스에 위치한 포켓몬 출력
			} catch (NumberFormatException exception) { // 입력 받은 값이 포켓몬 이름인 경우
				System.out.println(map.get(input)); // 포켓몬 이름에 해당하는 인덱스 출력
			}
		}
		sc.close();
	}
}