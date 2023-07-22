import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HashSet<String> result = new HashSet<>();

		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				// i부터 j까지 부분 문자열을 HashSet에 추가하여 중복제거. 
				result.add(input.substring(i, j + 1));
			}
		}

		System.out.println(result.size());
		sc.close();
	}
}
