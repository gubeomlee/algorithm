import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			List<Integer> arr = new ArrayList<>();
			char[] input = sc.next().toCharArray();

			int temp = 0; // 문자열 회전변수

			for (int i = 0; i < n / 4; i++) {
				for (int j = 0; j < 4; j++) {
					// 16진수 문자열 생성 
					StringBuilder sb = new StringBuilder();
					for (int l = 0; l < n / 4; l++) {
						sb.append(input[(j * n / 4 + l + temp) % n]);
					}
					// 16진수 문자열을 정수로 변환하여 추가 
					int num = Integer.parseInt(sb.toString(), 16);
					if (!arr.contains(num)) {
						arr.add(num);
					}
				}
				temp++;
			}
			// 내림차순 정렬 
			Collections.sort(arr, Collections.reverseOrder());
			System.out.printf("#%d %d\n", t, arr.get(k - 1));
		}
		sc.close();
	}
}