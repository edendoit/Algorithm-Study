public class No96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1; dp[1]=1;

        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
    // https://leetcode.com/problems/unique-binary-search-trees/editorial/?envType=study-plan-v2&envId=dynamic-programming
// https://www.youtube.com/watch?v=OIc0mHgHUww
}
