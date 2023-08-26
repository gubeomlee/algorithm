import java.util.Scanner;

public class Main {
	public static int getIdx(int start, int len, int time) {
		int dir = -1;
		time -= len - start; // 끝 모서리에서 시작한다.

		if (time <= 0) { // 끝 모서리에 도달하지 못하는 경우
			return len + time;
		}

		if (time / len % 2 == 1) { // 완성된 주기가 홀수인 경우 방향을 바꾼다.
			dir = 1;
		}
		if (dir == 1)
			return (time - len) % len;
		else
			return len - time % len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int time = sc.nextInt();

		int rx = getIdx(x, w, time);
		int ry = getIdx(y, h, time);

		System.out.println(rx + " " + ry);
		sc.close();
	}
}