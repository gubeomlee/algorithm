import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Boolean> nMap = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			// 입력받은 값을 key로 하고, 이때 값은 true로 한다. 
			nMap.put(Integer.parseInt(st.nextToken()), true);
		}

		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			// testNum이 Map에 있는지 확인하고, 없다면 false를 기본값으로 출력한다. 
			int testNum = Integer.parseInt(st.nextToken());
			if (nMap.getOrDefault(testNum, false)) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}