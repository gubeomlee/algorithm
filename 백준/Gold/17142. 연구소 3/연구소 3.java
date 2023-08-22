import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	// 바이러스의 확산 시간을 계산하는 메서드
	public static void getVirusTime(int[][] matrix, Queue<int[]> idx, int emptySpace, int[] result) {
		int cnt = 0;
		int emptyCnt = 0;
		int[][] direction = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

		while (!idx.isEmpty()) {
			if (emptyCnt == emptySpace) {
				result[0] = Math.min(result[0], cnt); // 최소 시간 업데이트
				return;
			}

			int size = idx.size(); // 반복횟수가 중간에 변하면 안되므로 길이를 변수에 넣어서 쓴다.
			for (int i = 0; i < size; i++) {
				int[] cur = idx.poll();
				if (matrix[cur[0]][cur[1]] == 0) {
					emptyCnt++;
					matrix[cur[0]][cur[1]] = 1;
				}
				for (int[] dir : direction) {
					int row = cur[0] + dir[0];
					int col = cur[1] + dir[1];
					if (0 <= row && row < matrix.length && 0 <= col && col < matrix[0].length
							&& matrix[row][col] != 1) {
						if (matrix[row][col] == 0) {
							emptyCnt++;
						}
						matrix[row][col] = 1;
						idx.add(new int[] { row, col });
					}
				}
			}
			cnt++;
		}
	}

	// 조합을 생성하는 백트래킹 함수
	public static void backtrack(List<int[]> virusIdx, int depth, List<int[]> temp, List<List<int[]>> combination) {
		if (depth == 0) {
			combination.add(new ArrayList<>(temp)); // 조합을 결과 리스트에 추가
		} else {
			for (int i = 0; i < virusIdx.size(); i++) {
				List<int[]> subList = new ArrayList<>(virusIdx.subList(i + 1, virusIdx.size()));
				temp.add(virusIdx.get(i));
				backtrack(subList, depth - 1, temp, combination); // 다음 단계로 진행
				temp.remove(temp.size() - 1); // 현재 단계 완료 후 백트래킹
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int m = sc.nextInt();
		int emptySpace = 0;

		int[][] matrix = new int[len][len];
		List<int[]> virusIdx = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] == 2) {
					virusIdx.add(new int[] { i, j });
				}
				if (matrix[i][j] == 0) {
					emptySpace++;
				}
			}
		}

		List<List<int[]>> combination = new ArrayList<>();
		backtrack(virusIdx, m, new ArrayList<>(), combination); // 조합 생성

		int[] result = { Integer.MAX_VALUE };
		for (List<int[]> com : combination) {
			int[][] testMatrix = new int[len][len];
			for (int i = 0; i < len; i++) {
				testMatrix[i] = Arrays.copyOf(matrix[i], len); // 테스트 매트릭스 생성
			}
			Queue<int[]> que = new LinkedList<>(com); // 큐에 시작 지점 추가
			getVirusTime(testMatrix, que, emptySpace, result); // 바이러스 확산 시간 계산
		}

		if (result[0] == Integer.MAX_VALUE) {
			result[0] = -1; // 최소 시간 갱신되지 않았을 경우 -1로 설정
		}
		System.out.println(result[0]);
		sc.close();
	}
}