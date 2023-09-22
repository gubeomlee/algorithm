import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		long[] arr = new long[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextLong();
		}

		Arrays.sort(arr);

		long status = Long.MAX_VALUE;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 2; j < len; j++) {
				int start = i;
				int end = j;
				while (start <= end) {
					int mid = (start + end) / 2;
					long temp = Math.abs(arr[i] + arr[mid] + arr[j]);

					if (status > temp && i != mid && j != mid) {
						status = temp;
						sb = new StringBuilder();
						sb.append(arr[i] + " ");
						sb.append(arr[mid] + " ");
						sb.append(arr[j]);
					}

					int tempMid1 = (start + mid - 1) / 2;
					int tempMid2 = (mid + 1 + end) / 2;

					if (Math.abs(arr[i] + arr[tempMid1] + arr[j]) > Math.abs(arr[i] + arr[tempMid2] + arr[j])) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}