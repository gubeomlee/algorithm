import java.util.Scanner;

public class Main {
	public static char classification(int x1, int y1, int p1, int q1, int x2, int y2, int p2, int q2) {
		boolean a1 = x2 < p1;
		boolean a2 = q1 <= y2;
		boolean a3 = q2 <= y1;
		boolean b1 = x2 < p1;
		boolean b1_1 = q1 == y2;
		boolean b1_2 = y1 == q2;
		boolean b2 = p1 == x2;
		boolean b2_1 = q1 < y2;
		boolean b2_2 = q2 < y1;
		boolean c1 = (p1 == x2) && (q1 == y2);
		boolean c2 = (p1 == x2) && (y1 == q2);
		if (a1 && !a2 && !a3) {
			return 'a';
		} else if (c1 || c2) {
			return 'c';
		} else if ((b1 && (b1_1 || b1_2)) || (b2 && !b2_1 && !b2_2)) {
			return 'b';
		} else {
			return 'd';
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 4; t++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int p2 = sc.nextInt();
			int q2 = sc.nextInt();

			char result = ' ';

			// 왼쪽 아래 x좌표를 기준으로 한다.
			if (x1 > x2) {
				result = classification(x2, y2, p2, q2, x1, y1, p1, q1);
			} else {
				result = classification(x1, y1, p1, q1, x2, y2, p2, q2);
			}

			System.out.println(result);
		}
		sc.close();
	}
}