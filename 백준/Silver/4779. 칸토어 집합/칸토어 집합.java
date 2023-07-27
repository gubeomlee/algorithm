import java.util.Scanner;

public class Main {
	public static void cantor(char[] arr, int len, int start, int end) {
		if (start < end) {
			// 중간 구간을 공백으로 설정하여 칸토어 집합 생성 
			for (int i = start + len; i < start + len * 2; i++) {
				arr[i] = ' ';
			}
			cantor(arr, len / 3, start, start + len - 1);
			cantor(arr, len / 3, start + len * 2, end);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int len = (int) Math.pow(3, sc.nextInt());
			char[] result = new char[len];
			for (int i = 0; i < len; i++) {
				result[i] = '-';
			}

			cantor(result, len / 3, 0, len - 1);
			System.out.println(result);
		}
		sc.close();
	}
}