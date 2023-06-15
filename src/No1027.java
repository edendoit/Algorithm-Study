import java.util.HashMap;
import java.util.Map;

public class No1027 {
    public int longestArithSeqLength(int[] nums) {
        int m = nums.length;
        Map<Integer, Integer>[] map = new HashMap[m];
        int ans = 1;
        for(int i=0; i<m; i++) {
            map[i] = new HashMap<>();
            for(int j=0; j<i; j++) {
                int compare = nums[i]-nums[j];
                map[i].put(compare, map[j].getOrDefault(compare, 1)+1);
                ans = Math.max(ans, map[i].get(compare));
            }


        }
        return ans;
    }
    // https://leetcode.com/problems/longest-arithmetic-subsequence/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
