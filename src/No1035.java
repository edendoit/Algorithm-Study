public class No1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        int[] prev = new int[n+1];
        int[] cur = new int[n+1];

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(nums1[i-1]==nums2[j-1]) {
                    cur[j] = 1+prev[j-1];
                } else {
                    cur[j] = Math.max(cur[j-1], prev[j]);
                }
            }
            prev = cur.clone();
        }
        return cur[n];
    }
    // https://leetcode.com/problems/uncrossed-lines/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
