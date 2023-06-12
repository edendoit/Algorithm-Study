public class No931 {
    public int minFallingPathSum(int[][] matrix) {
        int dp[] = new int[matrix.length+1];

        for(int i=matrix.length-1; i>=0; i--) {
            int cur[] = new int[matrix.length+1];

            for(int j=0; j<matrix.length; j++) {
                if(j==0) {
                    cur[j] = Math.min(dp[j], dp[j+1])+matrix[i][j];
                } else if(j==matrix.length-1) {
                    cur[j] = Math.min(dp[j], dp[j-1])+matrix[i][j];
                } else {
                    cur[j] = Math.min(dp[j], Math.min(dp[j+1], dp[j-1])) + matrix[i][j];
                }
            }
            dp=cur;

        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            min = Math.min(min, dp[i]);
        }
        return min;
    }
    // https://leetcode.com/problems/minimum-falling-path-sum/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
