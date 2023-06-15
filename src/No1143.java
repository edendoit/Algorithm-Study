public class No1143 {
    private int[][] memo;
    private String text1, text2;
    public int longestCommonSubsequence(String text1, String text2) {
        this.memo = new int[text1.length()+1][text2.length()+1];
        for(int i=0; i<text1.length(); i++) {
            for(int j=0; j<text2.length(); j++) {
                this.memo[i][j] = -1;
            }
        }
        this.text1 = text1;
        this.text2 = text2;
        return memoSolve(0, 0);
    }
    private int memoSolve(int p1, int p2) {
        if(memo[p1][p2] != -1) return memo[p1][p2];

        int ans=0;
        if(text1.charAt(p1)==text2.charAt(p2)) {
            ans = 1+memoSolve(p1+1, p2+1);
        } else {
            ans = Math.max(memoSolve(p1, p2+1), memoSolve(p1+1, p2));
        }
        memo[p1][p2]=ans;
        return memo[p1][p2];
    }
    // https://leetcode.com/problems/longest-common-subsequence/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
