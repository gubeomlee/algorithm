import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		int roomSize = sc.nextInt();
		int[][] room = new int[7][3]; // row는 학년이고, col은 성별 및 방의 합계다.

		for (int i = 0; i < student; i++) {
			int s = sc.nextInt();
			int y = sc.nextInt();
			if (room[y][s] < roomSize) { // 방에 공간이 있다면 방에 인원을 추가한다.
				room[y][s]++;
			} else { // 방에 공간이 없다면 새로운 방을 만들고 방의 합계를 늘린다.
				room[y][s] = 1;
				room[y][2]++;
			}
		}

		int result = 0;
		for (int i = 1; i <= 6; i++) {
			// 방에 학생이 있다면 방의 수를 더한다.
			if (room[i][0] > 0) {
				result++;
			}
			if (room[i][1] > 0) {
				result++;
			}
			// 학년별 방의 수를 더한다.
			result += room[i][2];
		}
		System.out.println(result);
		sc.close();
	}
}