import java.util.Scanner;

public class Main {
	// 거리를 계산하는 메서드
	public static int getDistance(int dir, int idx, int testDir, int testIdx, int w, int h) {
		if (testDir == 1) {
			return h + Math.min(idx + testIdx, 2 * w - idx - testIdx);
		} else if (testDir == 2) {
			return Math.abs(idx - testIdx);
		} else if (testDir == 3) {
			return idx + h - testIdx;
		} else {
			return w - idx + h - testIdx;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int tc = sc.nextInt();
		int[][] matrix = new int[tc][2];
		for (int t = 0; t < tc; t++) {
			matrix[t][0] = sc.nextInt();
			matrix[t][1] = sc.nextInt();
		}
		int dir = sc.nextInt();
		int idx = sc.nextInt();
		// 경비원을 기준으로 방향 조정
		int[] direction = { 0, 4, 3, 1, 2 };
		while (dir != 2) {
			int temp = w;
			w = h;
			h = temp;
			if (dir == 3 || dir == 4) {
				idx = w - idx;
			}
			dir = direction[dir];
			for (int[] arr : matrix) {
				if (arr[0] == 3 || arr[0] == 4) {
					arr[1] = w - arr[1];
				}
				arr[0] = direction[arr[0]];
			}
		}

		int result = 0;
		for (int[] arr : matrix) {
			result += getDistance(dir, idx, arr[0], arr[1], w, h);
		}
		System.out.println(result);
		sc.close();
	}
}