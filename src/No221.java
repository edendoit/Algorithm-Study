public class No221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)return 0;
        int m = matrix.length, n=matrix[0].length, res=0;
        int[][] ans = new int[m+1][n+1];

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(matrix[i-1][j-1]=='1') {
                    ans[i][j] = Math.min(Math.min(ans[i][j-1], ans[i-1][j-1]), ans[i-1][j])+1;
                    res = Math.max(ans[i][j], res);
                }
            }
        }
        return res*res;
    }
// https://leetcode.com/problems/maximal-square/solutions/61802/extremely-simple-java-solution/?envType=study-plan-v2&envId=dynamic-programming
// https://youtu.be/aYnEO53H4lw
}
