import java.io.*;
import java.util.*;
public class BJ11725 {
    static int N;
    static List<Integer> list[];
    static int[] parent;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        visited = new boolean[N+1];
        list = new ArrayList[N+1];

        StringTokenizer st;
        for(int i=0; i<N+1; i++) {
            list[i] = new ArrayList<>();

        }
        for(int i=0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int y=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            list[y].add(x);
            list[x].add(y);
        }


        dfs(1);
        //for(int i=2; i<parent.length; i++) {
        //    System.out.println(parent[i]);
        //}
    }
    static void dfs(int i) {
        visited[i]=true;
        for(int res:list[i]) {
            if(!visited[res]) {
                parent[res]=i;
                System.out.println("parent["+res+"] : "+i);
                dfs(res);
            }
        }
    }
}
