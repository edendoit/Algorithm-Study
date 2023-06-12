public class No63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] grid = new int[m][n];

        for(int i=0; i<m; i++) {
            if(obstacleGrid[i][0]==1) {
                grid[i][0] = 0;
                break;
            }
            grid[i][0]=1;
        }
        for(int i=0; i<n; i++) {
            if(obstacleGrid[0][i]==1) {
                grid[0][i]=0;
                break;
            }
            grid[0][i]=1;
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(obstacleGrid[i][j]==1) {
                    grid[i][j]=0;
                } else {
                    grid[i][j] = grid[i-1][j]+grid[i][j-1];
                }
            }

        }
        return grid[m-1][n-1];
    }
    // https://leetcode.com/problems/unique-paths-ii/solutions/23395/java-simple-and-clean-dp-solution-easy-to-understand/?envType=study-plan-v2&envId=dynamic-programming
}
