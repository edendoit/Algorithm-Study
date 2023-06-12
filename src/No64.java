public class No64 {
    public int minPathSum(int[][] grid) {
        for(int i=grid.length-1; i>=0; i--) {
            for(int j=grid[0].length-1; j>=0; j--) {
                // 맨 끝줄 제외한 가로줄
                if(i==grid.length-1 && j != grid[0].length-1)
                {grid[i][j] = grid[i][j] + grid[i][j+1];}

                // 둘째 가로줄 부터
                else if(i!=grid.length-1 && j==grid[0].length-1)
                {grid[i][j] = grid[i][j]+grid[i+1][j];}

                // 끝줄 빼고
                else if(i!=grid.length-1 && j!=grid[0].length-1)
                {grid[i][j] = grid[i][j]+Math.min(grid[i+1][j], grid[i][j+1]);}
            }
        }
        return grid[0][0];
    }
    // https://leetcode.com/problems/minimum-path-sum/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
