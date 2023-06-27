public class No474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String s : strs) {
            int[] cnt = countZeroOne(s);
            for(int zero=m; zero>=cnt[0]; zero--) {
                for(int one=n; one>=cnt[1]; one--) {
                    dp[zero][one] = Math.max(1+dp[zero-cnt[0]][one-cnt[1]],dp[zero][one]);
                }
            }
        }return dp[m][n];
    }

    public int[] countZeroOne(String s) {
        int[] c = new int[2];
        for(int i=0; i<s.length(); i++) {
            c[s.charAt(i)-'0']++;
        }
        return c;
    }
    // https://leetcode.com/problems/ones-and-zeroes/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
