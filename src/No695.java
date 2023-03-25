public class No695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    max = dfs(grid, i, j);
                }
            }
        }

        return max;
    }

    public int dfs(int[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0) {
            return -1;
        }

        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);

        return count;
    }
    // https://www.youtube.com/watch?v=W8VuDt0eb5c

    static int num = 0;
    public int maxAreaOfIsland2(int[][] grid) {
        int cnt=0;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    num=0;
                    dfs2(grid, i, j);

                    cnt = Math.max(cnt, num);
                }
            }
        }
        return cnt;
    }

    public void dfs2(int[][] grid, int i, int j) {
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1) {
            grid[i][j]=0;
            dfs(grid, i+1, j);
            dfs(grid, i-1, j);
            dfs(grid, i, j+1);
            dfs(grid, i, j-1);
            num++;
        }
    }
    // solved by myself!
}

