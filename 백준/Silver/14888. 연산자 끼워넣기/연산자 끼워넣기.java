import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// 가능한 연산자 조합 구성 
	public static void backtrack(int[] com, int depth, List<Integer> temp, List<List<Integer>> comArr) {
		if (depth == 0) {
			comArr.add(new ArrayList<>(temp));
		} else {
			for (int i = 0; i < 4; i++) {
				if (com[i] != 0) {
					com[i]--;
					temp.add(i);
					backtrack(com, depth - 1, temp, comArr);
					com[i]++;
					temp.remove(temp.size() - 1);
				}
			}
		}
	}
	// 주어진 연산자 조합을 기반으로 결과 계산 
	public static int calculate(int[] arr, List<Integer> c) {
		int result = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (c.get(i) == 0) {
				result += arr[i + 1];
			} else if (c.get(i) == 1) {
				result -= arr[i + 1];
			} else if (c.get(i) == 2) {
				result *= arr[i + 1];
			} else if (c.get(i) == 3) {
				result /= arr[i + 1];
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		int[] com = new int[4];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			com[i] = sc.nextInt();
		}

		List<List<Integer>> comArr = new ArrayList<>();
		backtrack(com, len - 1, new ArrayList<>(), comArr);

		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		// 각 연산자 조합에 대한 결과 게산 
		for (List<Integer> c : comArr) {
			int temp = calculate(arr, c);
			maxNum = Math.max(maxNum, temp);
			minNum = Math.min(temp, minNum);
		}
		System.out.printf("%d\n%d", maxNum, minNum);
		sc.close();
	}
}
