import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	// 리스트 내 두 조합에 대한 합 반환하는 메서드
	public static int getSum(int[][] matrix, List<Integer> list) {
		int sum = 0;
		for (int num1 : list) {
			for (int num2 : list) {
				sum += matrix[num1][num2];
			}
		}
		return sum;
	}

	public static void backtrack(int[][] matrix, int len, int idx, List<Integer> arr, List<Integer> temp,
			int[] result) {
		// 조합의 크기가 len/2와 같아지면 계산 후 결과 갱신
		if (temp.size() == len / 2) {
			int sum1 = getSum(matrix, arr);
			int sum2 = getSum(matrix, temp);
			result[0] = Math.min(result[0], Math.abs(sum1 - sum2));
		} else {
			for (int i = idx; i < arr.size(); i++) {
				List<Integer> subList = new ArrayList<>(arr.subList(0, i));
				subList.addAll(arr.subList(i + 1, arr.size()));
				temp.add(arr.get(i)); // 요소선택
				backtrack(matrix, len, i, subList, temp, result);
				temp.remove(temp.size() - 1); // 백트래킹
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();

			int[][] matrix = new int[len][len];
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int[] result = { Integer.MAX_VALUE };
			List<Integer> arr = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				arr.add(i);
			}
			backtrack(matrix, len, 0, arr, new ArrayList<>(), result);

			System.out.printf("#%d %d\n", t, result[0]);
		}
		sc.close();
	}
}