public class No1884 {
    public int twoEggDrop(int n) {
        int egg = 2;
        int[][] dp = new int[n+1][egg+1];
        return eggDrop(n, egg, dp);
    }

    public int eggDrop (int n, int egg, int[][] dp) {
        if(n<=2 || egg==1) return n;
        if(dp[n][egg]!=0) return dp[n][egg];
        int min = n;

        for(int i=1; i<n; i++) {
            int eggBreak = 1+eggDrop(i-1, egg-1, dp);
            int noEggBreak = 1+eggDrop(n-i, egg, dp);
            int moves = Math.max(eggBreak, noEggBreak);
            min = Math.min(min, moves);


        }
        dp[n][egg] = min;
        return min;
    }
}
// https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors/discuss/1767634/Simple-Java-DP-solution-for-N-floor-K-egg
