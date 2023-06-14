public class No712 {
    public int minimumDeleteSum(String s1, String s2) {
        int m=s1.length(), n=s2.length();
        int[][] res = new int[m+1][n+1];

        for(int i=m-1; i>=0; i--) {
            res[i][n] = res[i+1][n]+s1.codePointAt(i);
        }
        for(int i=n-1; i>=0; i--) {
            res[m][i] = res[m][i+1]+s2.codePointAt(i);
        }

        for(int i=m-1; i>=0; i--) {
            for(int j=n-1; j>=0; j--) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    res[i][j] = res[i+1][j+1];
                } else {
                    res[i][j] = Math.min(res[i+1][j] + s1.codePointAt(i), res[i][j+1]+s2.codePointAt(j));
                }
            }
        }
        return res[0][0];
    }
    // https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
