public class No72 {
    public int minDistance(String word1, String word2) {
        int m=word1.length(), n=word2.length();
        int[][] cost = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
            cost[i][0] = i;
        for(int i=0; i<=n; i++)
            cost[0][i]=i;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(word1.charAt(i) == word2.charAt(j)) cost[i+1][j+1] = cost[i][j];
                else {
                    int add = cost[i][j+1];
                    int delete = cost[i+1][j];
                    int rep = cost[i][j];
                    cost[i+1][j+1] = Math.min(Math.min(add,delete),rep)+1;
                }
            }
        }
        return cost[m][n];
    }
    // https://leetcode.com/problems/edit-distance/solutions/25849/java-dp-solution-o-nm/comments/170586
}
