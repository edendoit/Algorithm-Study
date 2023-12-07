import java.io.*;
import java.util.*;
public class BJ1325 {
    static int N, M, cnt;
    static int max = Integer.MIN_VALUE;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<=N; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
        }

        int[] res= new int[N+1];
        for(int i=1; i<=N; i++){
            visited = new boolean[N+1];
            cnt=0;
            bfs(i);
            res[i]=cnt;
            max = Math.max(cnt, max);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++) {
            if(res[i] == max)
                sb.append(i+" ");
        }
        System.out.println(sb);

    }
    static void bfs(int x) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(x);
        visited[x]=true;
        while(!qu.isEmpty()) {
            int cur = qu.poll();
            for(int i : list.get(cur)) {
                if(!visited[i]) {
                    qu.offer(i);
                    visited[i]=true;
                    cnt++;
                }
            }
        }
    }
}
