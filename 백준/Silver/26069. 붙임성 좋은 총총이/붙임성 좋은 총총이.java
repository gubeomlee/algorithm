import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();

		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		for (int i = 0; i < len; i++) {
			String[] name = sc.nextLine().split(" ");
			if (set.contains(name[0])) {
				set.add(name[1]);
			} else if (set.contains(name[1])) {
				set.add(name[0]);
			}
		}
		System.out.println(set.size());
		sc.close();
	}
}
