public class No547 {
    public int findCircleNum(int[][] grid) {
        int[] visited = new int[grid.length];
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            if(visited[i] == 0) {
                dfs(grid, visited, i);
                count++;
            }
        }
        return count;
    }


    public void dfs(int[][] grid, int[] visited, int i) {
        for(int j=0; j<grid.length; j++) {
            if(grid[i][j] ==1 && visited[j] == 0){
                visited[j] = 1;
                dfs(grid, visited, j);
            }
        }
    }
}
