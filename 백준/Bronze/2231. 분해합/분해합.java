import java.util.Scanner;

public class Main {
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
