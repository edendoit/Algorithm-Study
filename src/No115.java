public class No115 {
    // too difficult.... maybe i have to do next time again.
    public int numDistinct(String s, String t) {
        int m=s.length(), n=t.length();
        int[][] cnt = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            cnt[i][0] = 1;
        }
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(s.charAt(i-1)==t.charAt(j-1)) {
                    cnt[i][j] = cnt[i-1][j-1] + cnt[i-1][j];
                } else {
                    cnt[i][j] = cnt[i-1][j];
                }
            }
        }
        return cnt[m][n];
    }
}
