import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] num = new int[N][N]; // 숫자 배열
        int[][] sum = new int[N][N]; // 누적합 배열

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
                if (i == 0 && j == 0) sum[i][j] = num[i][j];
                else if (j == 0) sum[i][j] = sum[i - 1][j] + num[i][j];
                else if (i == 0) sum[i][j] = sum[i][j - 1] + num[i][j];
                else sum[i][j] = sum[i][j - 1] + sum[i - 1][j] + num[i][j] - sum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int startR = Integer.parseInt(st.nextToken()) - 1; // x1
            int startC = Integer.parseInt(st.nextToken()) - 1; // y1
            int endR = Integer.parseInt(st.nextToken()) - 1; // x2
            int endC = Integer.parseInt(st.nextToken()) - 1; // y2

            int tmp = 0; // 구간합
            
            // 구간합 구하기
            if (startR - 1 >= 0 && startC - 1 >= 0) {
            	tmp = sum[endR][endC] - sum[startR - 1][endC] - sum[endR][startC - 1] + sum[startR - 1][startC - 1];
            } else if (startR == 0 && startC > 0) {
            	tmp = sum[endR][endC] - sum[endR][startC - 1];
            } else if (startR > 0 && startC == 0) {
            	tmp = sum[endR][endC] - sum[startR - 1][endC];
            } else {
            	tmp = sum[endR][endC];
            }
            
            sb.append(tmp).append("\n");
        }

        System.out.println(sb); // 출력
    }
}