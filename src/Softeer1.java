// Softeer Lv3. 성적 평균
import java.io.*;
        import java.util.*;

public class Softeer1 {
    static int N, K;
    static int[] arr, avg;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 5
        K = Integer.parseInt(st.nextToken()); // 3
        arr = new int[N];

        // 점수 배열
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // 구간 1,3 / 3,4 / 1,5
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dif = y-x+1; // 3-1+1
            int sum=0;
            for(int j=x-1; j<y; j++) {
                sum += arr[j];
            }
            double l = (double)sum/dif;
            String formattedResult = String.format("%.2f", l);
            System.out.println(formattedResult);
        }
    }
}
