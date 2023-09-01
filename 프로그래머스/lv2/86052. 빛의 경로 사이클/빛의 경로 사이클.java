import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void getPath(String[] grid, int h, int w, int row, int col, int dir, List<Integer> list,
			int[][][] check) {
		int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		int cnt = 1;
		int r = row;
		int c = col;
		check[r][c][dir] = 1;

		do {
			char ch = grid[r].charAt(c);
			if (ch == 'R') {
				dir -= 1;
				if (dir < 0) {
					dir = 3;
				}
			} else if (ch == 'L') {
				dir = (dir + 1) % 4;
			}

			r += direction[dir][0];
			c += direction[dir][1];

			if (r >= h)
				r = 0;
			if (r < 0)
				r = h - 1;
			if (c >= w)
				c = 0;
			if (c < 0)
				c = w - 1;

			if (check[r][c][dir] == 1) {
				break;
			} else {
				check[r][c][dir] = 1;
			}
			cnt++;
		} while (true);

		if (row == r && col == c) {
			list.add(cnt);
		}
	}

	public static int[] solution(String[] grid) {
		int h = grid.length;
		int w = grid[0].length();

		List<Integer> list = new ArrayList<>();
		int[][][] check = new int[h][w][4];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 4; k++) {
					if (check[i][j][k] == 0) {
						getPath(grid, h, w, i, j, k, list, check);
					}
				}
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		Arrays.sort(result);
		return result;
	}
}