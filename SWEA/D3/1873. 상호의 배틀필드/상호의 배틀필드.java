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
			int dir = 0; // 현재 방향(1: 위, 2: 아래, 3: 왼쪽, 4: 오른쪽)
			char[][] matrix = new char[h][w];
			for (int i = 0; i < h; i++) {
				matrix[i] = sc.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (matrix[i][j] == '^') {
						row = i;
						col = j;
						dir = 1;
					} else if (matrix[i][j] == 'v') {
						row = i;
						col = j;
						dir = 2;
					} else if (matrix[i][j] == '<') {
						row = i;
						col = j;
						dir = 3;
					} else if (matrix[i][j] == '>') {
						row = i;
						col = j;
						dir = 4;
					}
				}
			}

			int len = sc.nextInt();
			char[] com = sc.next().toCharArray();
			int[][] direction = { { 0, 0 }, { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
			char[] dirChar = { ' ', '^', 'v', '<', '>' }; // 방향 인덱스 문자 표시 
			Map<Character, Integer> map = new HashMap<>(); // 문자 방향 인덱시 표기 
			map.put('U', 1);
			map.put('D', 2);
			map.put('L', 3);
			map.put('R', 4);

			for (int i = 0; i < len; i++) {
				if (com[i] == 'S') { // 포탄 발사 명령 
					int tr = row;
					int tc = col;
					while (true) {
						tr += direction[dir][0];
						tc += direction[dir][1];
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
					int tr = row + direction[map.get(com[i])][0];
					int tc = col + direction[map.get(com[i])][1];
					matrix[row][col] = dirChar[map.get(com[i])]; // 방향 전환 
					dir = map.get(com[i]); // 방향 전환 
					if (0 <= tr && tr < h && 0 <= tc && tc < w) {
						if (matrix[tr][tc] == '.') { // 이동 가능한 경우 
							matrix[row][col] = '.';
							matrix[tr][tc] = dirChar[map.get(com[i])];
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