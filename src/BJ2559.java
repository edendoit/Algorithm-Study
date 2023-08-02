import java.io.*;
import java.util.*;
public class BJ2559 {
    static int N, K, max=Integer.MIN_VALUE;
    static int[] num, sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        num = new int[N];
        sum = new int[N-K+1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N-K+1; i++) {
            for(int j=0; j<K; j++) {

                sum[i] += num[i+j];
            }
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}