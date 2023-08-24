import java.util.Scanner;

public class Solution {
	// 최대 힙에 값을 삽입하는 메서드
	public static void heapPush(long[] heap, int[] heapSize, long item) {
		heap[++heapSize[0]] = item;

		int ch = heapSize[0]; // 현재 삽입한 노드의 인덱스
		int p = ch / 2; // 부모 노드의 인덱스
		// 부모 노드와 비교하여 힙을 재정렬한다.
		while (p > 0 && heap[ch] > heap[p]) {
			long temp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = temp;
			ch = p;
			p /= 2;
		}
	}

	// 최대 힙에서 제거하는 메서드
	public static Long heapPop(long[] heap, int[] heapSize) {
		if (heapSize[0] <= 0) { // 힙이 비어있는 경우
			return -1L;
		}

		long item = heap[1]; // 제거할 값
		heap[1] = heap[heapSize[0]--]; // 마지막 노드를 루트로 옮긴다.

		int p = 1;
		int ch = p * 2;
		// 오른쪽 자식이 더 큰 경우 오른쪽 자식을 선택한다.
		if (ch + 1 <= heapSize[0] && heap[ch] < heap[ch + 1]) {
			ch++;
		}
		// 자식 노드와 비교하며 힙을 재정렬
		while (ch <= heapSize[0] && heap[p] < heap[ch]) {
			long temp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = temp;
			p = ch;
			ch = p * 2;
			if (ch + 1 <= heapSize[0] && heap[ch] < heap[ch + 1]) {
				ch++;
			}
		}
		return item;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			long[] heap = new long[100001];
			int[] heapSize = { 0 };
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < len; i++) {
				int com = sc.nextInt();
				if (com == 1) { // 삽입할 값을 입력
					long num = sc.nextLong();
					heapPush(heap, heapSize, num);
				} else { // 최대 힙에서 값을 제거
					Long pop = heapPop(heap, heapSize);
					sb.append(pop + " ");
				}
			}
			System.out.printf("#%d %s\n", t, sb);
		}
		sc.close();
	}
}