import java.io.*;
import java.util.*;

public class Softeer2 {
    static int N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 1;
        int l=0, cnt=1;
        for(int i=0; i<N-1; i++) {
            l=arr[i]; // 기준
            for(int j=i; j<N; j++){
                if(l<arr[j]) {
                    l=arr[j];
                    cnt++;
                    max = Math.max(max, cnt);
                }
                if(l>arr[j] && arr[i]<arr[j]) {
                    l=arr[j];
                    cnt=2;
                }

            }

            cnt=1;
        }
        System.out.println(max);

    }
}
