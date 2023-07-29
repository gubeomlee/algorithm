import java.util.Scanner;

public class Main {
	// num: 이동할 원한의 개수
	// from: 원반의 현재 위치
	// to: 원반의 도착 위치
	// via: 중간에 사용할 보조 장대의 위치
	private static StringBuilder sb = new StringBuilder();

	public static void hanoi(int num, int from, int to, int via) {
		if (num == 1) {
			sb.append(from + " " + to + '\n');
		} else {
			// n-1개 원반을 from에서 via로 이동
			hanoi(num - 1, from, via, to);
			// 가장 큰 원반을 from에서 to로 이동
			sb.append(from + " " + to + '\n');
			// n-1개 원반을 via에서 to로 이동
			hanoi(num - 1, via, to, from);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println((int) Math.pow(2, num) - 1);
		hanoi(num, 1, 3, 2);
		System.out.print(sb);

		sc.close();
	}
}