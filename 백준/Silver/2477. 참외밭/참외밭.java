import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int[] count = new int[5]; // 방향별 개수 저장
		Queue<int[]> que = new LinkedList<>();
		for (int i = 0; i < 6; i++) {
			int[] arr = { sc.nextInt(), sc.nextInt() };
			que.offer(arr);
			count[arr[0]]++; // 방향별 개수 저장
		}
		// 시작방향 개수가 1이 나오도록 큐 조정
		while (count[que.peek()[0]] != 1) {
			que.offer(que.poll());
		}

		int area = 1; // 최종면적
		int tempArea = 1; // 뺄면적
		int flag = 0; // 뺄면적 확인용 플래그
		for (int[] arr : que) {
			if (count[arr[0]] == 1) { // 방향의 개수가 1개라면 최종면적에 곱한다.
				area *= arr[1];
			}
			if (count[arr[0]] == 2) { // 방향의 개수가 2개라면
				if (flag == 1 || flag == 2) { // 프래그가 1,2일때만 뺄면적에 곱한다.
					tempArea *= arr[1];
				}
				flag++;
			}
		}
		System.out.println((area - tempArea) * cnt);
		sc.close();
	}
}