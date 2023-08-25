import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	// 간격의 최대 길이 구하는 메서드
	public static int getLen(List<Integer> arr, int maxLen) {
		int len = 0;

		if (arr.size() > 0) { // 분할 요소가 있는 경우
			len = arr.get(0);
			for (int i = 1; i < arr.size(); i++) {
				len = Math.max(len, arr.get(i) - arr.get(i - 1));
			}
			len = Math.max(len, maxLen - arr.get(arr.size() - 1));
		} else { // 분할 요소가 없는 경우
			len = maxLen;
		}

		return len;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int xLen = sc.nextInt(); // 가로 길이
		int yLen = sc.nextInt(); // 세로 길이
		int len = sc.nextInt(); // 분할 개수

		List<Integer> row = new ArrayList<>(); // 행분할
		List<Integer> col = new ArrayList<>(); // 열분할

		for (int i = 0; i < len; i++) {
			int flag = sc.nextInt();
			if (flag == 0) { // 행분할 지점 저장
				row.add(sc.nextInt());
			} else { // 열분할 지점 저장
				col.add(sc.nextInt());
			}
		}

		Collections.sort(row);
		Collections.sort(col);

		int y = getLen(row, yLen); // 세로 방향 최대 길이 간격 계산
		int x = getLen(col, xLen); // 가로 방향 최대 길이 간격 계산

		System.out.println(y * x);
		sc.close();
	}
}