import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int[] count = new int[5];
		Queue<Integer> queDir = new LinkedList<>();
		Queue<Integer> queLen = new LinkedList<>();

		for (int i = 0; i < 6; i++) {
			int tempDir = sc.nextInt();
			queDir.offer(tempDir);
			queLen.offer(sc.nextInt());
			count[tempDir]++;
		}
		// 뺄 구간이 아닌 곳에서 시작하게 조정
		while (count[queDir.peek()] != 1) {
			queDir.offer(queDir.poll());
			queLen.offer(queLen.poll());
		}

		int[] nextDirection = { 0, 4, 3, 1, 2 }; // 다음 방향 저장
		int row = 0; // 행의 최대 길이
		int col = 0; // 열의 최대 길이
		int temp = 0; // 뺄 면적

		int dir = queDir.poll(); // 시작 방향
		int len = queLen.poll(); // 시작 길이
		for (int i = 0; i < 5; i++) {
			if (dir == 1 || dir == 2) { // 가로로 이동한 경우 가로 길이 갱신
				row = Math.max(row, len);
			} else { // 세로로 이동한 경우 세로 길이 갱신
				col = Math.max(col, len);
			}
			if (nextDirection[dir] != queDir.peek()) { // 다음 방향이 정상 방향이 아닌 경우 뺄 면적을 구한다.
				temp = len * queLen.peek();
			}
			dir = queDir.poll(); // 방향을 갱신한다.
			len = queLen.poll(); // 길이를 갱신한다.
		}
		if (dir == 1 || dir == 2) { // 가로로 이동한 경우 가로 길이 갱신
			row = Math.max(row, len);
		} else { // 세로로 이동한 경우 세로 길이 갱신
			col = Math.max(col, len);
		}
		System.out.println((row * col - temp) * cnt);

		sc.close();
	}
}