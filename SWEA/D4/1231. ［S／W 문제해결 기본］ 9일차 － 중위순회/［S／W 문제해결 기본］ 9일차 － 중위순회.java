import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
	public static void inorder(String[] arr, int idx, int len) {
		if (idx < len) {
			// 왼쪽 자식 노드 순회
			inorder(arr, idx * 2, len);
			// 현재 노드 방문 처리
			if (arr[idx] != " ") {
				System.out.print(arr[idx]);
			}
			// 오른쪽 자식 노드 순회
			inorder(arr, idx * 2 + 1, len);
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int t = 1; t <= T; t++) {
			int len = sc.nextInt();
			sc.nextLine(); // 개행 문자 처리
			// 각 노드의 정보 입력 및 저장
			String[] arr = new String[len + 1];
			for (int i = 1; i <= len; i++) {
				StringTokenizer st = new StringTokenizer(sc.nextLine());
				st.nextToken();
				arr[i] = st.nextToken();
			}

			System.out.printf("#%d ", t);
			inorder(arr, 1, len + 1); // 루트 노드부터 중위 순회
			System.out.println();
		}
		sc.close();
	}
}