import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	// 계단을 다 내려온 사람을 계다에서 제거하는 메서드 
	public static void removeStairPerson(List<Integer> stair, int stairLen) {
		for (int i = 0; i < stair.size(); i++) {
			stair.set(i, stair.get(i) + 1);
			if (stair.get(i) > stairLen) {
				stair.remove(0);
				i--;
			}
		}
	}

	public static int getTime(List<Integer>[] distance, List<Integer> stairLen, boolean[] check) {
		int cnt = -1;
		List<int[]> dis = new ArrayList<>();
		List<Integer> stair1 = new ArrayList<>();
		List<Integer> stair2 = new ArrayList<>();
		
		// 조합에 맞춰 사람들의 계단까지 거리를 구한다. 
		for (int i = 0; i < check.length; i++) {
			if (check[i]) {
				dis.add(new int[] { distance[0].get(i), 0 });
			} else {
				dis.add(new int[] { distance[1].get(i), 1 });
			}
		}

		while (dis.size() > 0 || stair1.size() > 0 || stair2.size() > 0) {
			cnt++;
			// 계단에 도착한 사람이 있다면 제거한다. 
			removeStairPerson(stair1, stairLen.get(0));
			removeStairPerson(stair2, stairLen.get(1));

			for (int i = 0; i < dis.size(); i++) {
				dis.get(i)[0] -= 1;
				if (dis.get(i)[0] <= -1) {
					int num = 0; // 계단에 도착하자마자 계단을 내려가는 경우 
					if (dis.get(i)[0] < -1) // 계단에 도착한 뒤 기다렸다가 내려가는 경우 
						num = 1;
					if (dis.get(i)[1] == 0 && stair1.size() < 3) {
						stair1.add(num);
						dis.remove(i);
						i--;
					} else if (dis.get(i)[1] == 1 && stair2.size() < 3) {
						stair2.add(num);
						dis.remove(i);
						i--;
					}
				}
			}
		}
		return cnt;
	}
	
	// 사람들이 계단을 사용하는 조합을 구하고 해당 조합에서 쇼요되는 시간을 구한다. 
	public static void backtrack(List<Integer>[] distance, List<Integer> stairLen, boolean[] check, int idx,
			int[] result) {
		int cnt = getTime(distance, stairLen, check);
		result[0] = Math.min(result[0], cnt);

		for (int i = idx; i < check.length; i++) {
			check[i] = true;
			backtrack(distance, stairLen, check, i + 1, result);
			check[i] = false;
		}
	}
	
	// 두 좌표의 거리를 구하는 메서드 
	public static int getDist(int[] p, int[] s) {
		return Math.abs(p[0] - s[0]) + Math.abs(p[1] - s[1]);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();

			int[][] matrix = new int[len][len];
			List<int[]> stair = new ArrayList<>();
			List<Integer> stairLen = new ArrayList<>();

			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					matrix[i][j] = sc.nextInt();
					if (matrix[i][j] > 1) {
						stair.add(new int[] { i, j });
						stairLen.add(matrix[i][j]);
					}
				}
			}

			List<Integer>[] distance = new ArrayList[2];
			distance[0] = new ArrayList<>();
			distance[1] = new ArrayList<>();
			
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					if (matrix[i][j] == 1) {
						distance[0].add(getDist(new int[] { i, j }, stair.get(0)));
						distance[1].add(getDist(new int[] { i, j }, stair.get(1)));
					}
				}
			}

			int[] result = { Integer.MAX_VALUE };
			backtrack(distance, stairLen, new boolean[distance[0].size()], 0, result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}