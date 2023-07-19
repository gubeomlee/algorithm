import java.util.Scanner;

public class Main {
	public static boolean isDeathNum(int num) {
		char[] charNum = Integer.toString(num).toCharArray();
		int temp = 0;
		for (char ch : charNum) {
			if (ch == '6') {
				temp++;
			} else {
				temp = 0;
			}
			if (temp == 3) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int testNum = 666;
		while (num > 0) {
			if (isDeathNum(testNum)) {
				num--;
			}
			testNum++;
		}
		System.out.println(testNum - 1);
		sc.close();
	}
}