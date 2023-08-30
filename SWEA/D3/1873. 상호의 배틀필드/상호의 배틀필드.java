import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			int row = 0; // 현재 위치의 행
			int col = 0; // 현재 위치의 열
			char dir = ' ';
			char[][] matrix = new char[h][w];
			for (int i = 0; i < h; i++) {
				matrix[i] = sc.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (matrix[i][j] == '^' || matrix[i][j] == 'v' || matrix[i][j] == '<' || matrix[i][j] == '>') {
						row = i;
						col = j;
						dir = matrix[i][j];
					}
				}
			}

			int len = sc.nextInt();
			char[] com = sc.next().toCharArray();
			Map<Character, int[]> map = new HashMap<>(); // 문자 방향 인덱시 표기
			map.put('^', new int[] { -1, 0 });
			map.put('v', new int[] { 1, 0 });
			map.put('<', new int[] { 0, -1 });
			map.put('>', new int[] { 0, 1 });
			Map<Character, Character> comMap = new HashMap<>(); // 문자 방향 인덱시 표기
			comMap.put('U', '^');
			comMap.put('D', 'v');
			comMap.put('L', '<');
			comMap.put('R', '>');

			for (int i = 0; i < len; i++) {
				if (com[i] == 'S') { // 포탄 발사 명령
					int tr = row;
					int tc = col;
					while (true) {
						tr += map.get(dir)[0];
						tc += map.get(dir)[1];
						if (0 <= tr && tr < h && 0 <= tc && tc < w) {
							if (matrix[tr][tc] == '*') {
								matrix[tr][tc] = '.';
								break;
							} else if (matrix[tr][tc] == '#') {
								break;
							}
						} else {
							break;
						}
					}
				} else { // 이동 명령
					int tr = row + map.get(comMap.get(com[i]))[0];
					int tc = col + map.get(comMap.get(com[i]))[1];
					matrix[row][col] = comMap.get(com[i]); // 방향 전환
					dir = comMap.get(com[i]); // 방향 전환
					if (0 <= tr && tr < h && 0 <= tc && tc < w) {
						if (matrix[tr][tc] == '.') { // 이동 가능한 경우
							matrix[row][col] = '.';
							matrix[tr][tc] = comMap.get(com[i]);
							row = tr; // 현재 위치 갱신
							col = tc;
						}
					}
				}
			}

			System.out.printf("#%d ", t);
			for (char[] arr : matrix) {
				for (char ch : arr) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}