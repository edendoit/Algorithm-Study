import java.util.*;
        import java.io.*;

public class BJ2667 {
    public static int N;
    public static int total=0, cnt=0;
    public static int[][] grid;
    public static List<Integer> res;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        res = new ArrayList<>();

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()+"");
            for(int j=0; j<N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                dfs(grid, i, j);
                total++;
            }
        }
        System.out.println(cnt);
        for(Integer i : res) {
            System.out.println(i);
        }
    }

    public static void dfs(int[][] grid, int i, int j) {
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1) {
            grid[i][j] = 0;
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j-1);
            dfs(grid, i, j+1);
            cnt++;
            res.add(total);
            total = 0;
        }

    }
}