import java.io.*;
import java.util.*;
public class BJ11724 {
    static int N, M, cnt=0;
    static boolean[] visited;
    static int[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int y=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            grid[y][x]=grid[x][y]=1;
        }

        for(int i=1; i<=N; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void dfs(int i) {
        if(visited[i]) return;
        visited[i] = true;
        for(int j=1; i<=N; j++){
            if(grid[i][j]==1) dfs(j);
        }
    }
}
