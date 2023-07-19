import java.util.Scanner;

public class Main {
	// 주어진 숫자의 각 자리수를 더해주는 메서드 
	public static int func(int num) {
		int result = num;
		for (char ch : Integer.toString(num).toCharArray()) {
			result += Character.getNumericValue(ch);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 각 자리의 최댓값은 9이므로 "수의 자리수*10"만큼 작은 수보다 작다면 정답이 될 수 없다.
		for (int i = num - Integer.toString(num).length() * 10; i < num; i++) {
			if (num == func(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		sc.close();
	}
}