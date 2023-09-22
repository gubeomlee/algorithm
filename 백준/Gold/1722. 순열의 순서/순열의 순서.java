import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int com = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= len; i++) {
			list.add(i);
		}
		// 계산을 위한 펙토리얼 값 저장
		BigDecimal[] factorial = new BigDecimal[len + 1];
		factorial[0] = BigDecimal.ONE;
		factorial[1] = BigDecimal.ONE;
		for (int i = 2; i <= len; i++) {
			factorial[i] = factorial[i - 1].multiply(BigDecimal.valueOf(i));
		}

		if (com == 1) {
			BigDecimal cnt = sc.nextBigDecimal(); // 목표 값
			StringBuilder sb = new StringBuilder();

			BigDecimal temp = BigDecimal.ONE;
			while (temp.compareTo(cnt) < 0) {
				for (int i = 0; i < list.size(); i++) {
					// 현재 리스트로 가능한 순열의 수를 더해가며 각 자리수를 찾는다.
					// 적절한 자리수를 찾은 경우 해당 수를 제거하고, 다음 자리수를 찾는다.
					if (temp.add(factorial[list.size() - 1]).compareTo(cnt) > 0) {
						sb.append(list.get(i)).append(" ");
						list.remove(i);
						break;
					} else {
						temp = temp.add(factorial[list.size() - 1]);
					}
				}
			}

			for (int i = 0; i < list.size(); i++)
				sb.append(list.get(i)).append(" ");

			System.out.println(sb.toString());
		} else {
			BigDecimal sum = BigDecimal.ONE;
			for (int i = 0; i < len; i++) {
				int num = sc.nextInt();
				for (int j = 0; j < list.size(); j++) {
					if (num == list.get(j)) {
						// 해당 자리수보다 작은 값으로 만들 수 있는 순열의 수를 더한다.
						BigDecimal nextFactorial = factorial[list.size() - 1];
						sum = sum.add(nextFactorial.multiply(BigDecimal.valueOf(j)));
						list.remove(j);
						break;
					}
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}