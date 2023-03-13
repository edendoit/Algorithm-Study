import java.util.LinkedList;

public class No200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j]=='1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1')
            return;

        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }

    // bfs
    // https://leetcode.com/problems/number-of-islands/solutions/56338/java-dfs-and-bfs-solution/
    public int numIslands2(char[][] grid) {
        int count =0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, i, j);
                    count++;
                }
            }

        }
        return count;
    }

    private void bfs(char[][] grid, int x, int y) {
        grid[x][y] = '0';
        int n = grid.length;
        int m = grid[0].length;

        LinkedList<Integer> queue = new LinkedList<Integer>();
        int code = x*m+y;
        queue.offer(code);
        while(!queue.isEmpty()) {
            code = queue.poll();
            int i= code/m;
            int j = code%m;
            if(i>0 && grid[i-1][j] == '1') {
                queue.offer((i-1)*m+j);
                grid[i-1][j]='0';
            }
            if(i<n-1 && grid[i+1][j] == '1') {
                queue.offer((i+1)*m+j);
                grid[i+1][j]='0';
            }
            if(j>0 && grid[i][j-1] == '1') {
                queue.offer(i*m+j-1);
                grid[i][j-1]='0';
            }
            if(j<m-1 && grid[i][j+1]=='1') {
                queue.offer(i*m+j+1);
                grid[i][j+1] = '0';
            }
        }

    }
}
