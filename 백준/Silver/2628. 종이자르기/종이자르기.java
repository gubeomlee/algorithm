import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
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

		int y = 0;
		int x = 0;

		// 행분할에 따른 최대 세로 길이 갱신
		if (row.size() > 0) {
			y = row.get(0);
			for (int i = 1; i < row.size(); i++) {
				y = Math.max(y, row.get(i) - row.get(i - 1));
			}
			y = Math.max(y, yLen - row.get(row.size() - 1));
		} else {
			y = yLen;
		}

		// 열분할에 따른 최대 가로 길이 갱신
		if (col.size() > 0) {
			x = col.get(0);
			for (int i = 1; i < col.size(); i++) {
				x = Math.max(x, col.get(i) - col.get(i - 1));
			}
			x = Math.max(x, xLen - col.get(col.size() - 1));
		} else {
			x = xLen;
		}

		System.out.println(y * x);
		sc.close();
	}
}