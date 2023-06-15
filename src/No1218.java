import java.util.HashMap;
import java.util.Map;

public class No1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 1;

        for(int a: arr) {
            int beforeA = dp.getOrDefault(a-difference, 0);
            dp.put(a, beforeA+1);
            ans = Math.max(ans, dp.get(a));
        }

        return ans;
    }
    // https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
