import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void backtrack(int[][] matrix, int idx, int len, int maxCal, List<Integer> temp, int[] result) {
		int tempSum = 0;
		int tempCal = 0;
		// 현재 점수 합과 칼로리 합 구한다.
		for (int tempIdx : temp) {
			tempSum += matrix[tempIdx][0];
			tempCal += matrix[tempIdx][1];
		}
		// 현재 칼로리가 최대 칼로리보다 낮은 경우
		if (tempCal <= maxCal) {
			// 최대 점수 갱신
			result[0] = Math.max(result[0], tempSum);
			// 다음 재료에 대한 백트래킹 수행
			for (int i = idx; i < len; i++) {
				temp.add(i);
				backtrack(matrix, i + 1, len, maxCal, temp, result);
				temp.remove(temp.size() - 1); // 백트래킹
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			int maxCal = sc.nextInt();

			int[][] matrix = new int[len][2];
			for (int i = 0; i < len; i++) {
				matrix[i][0] = sc.nextInt();
				matrix[i][1] = sc.nextInt();
			}

			int[] result = { 0 };
			backtrack(matrix, 0, len, maxCal, new ArrayList<>(), result);
			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}