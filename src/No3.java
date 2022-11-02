import java.util.HashSet;
import java.util.Set;

public class No3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> value = new HashSet<>();
        int start = 0, end = 0, count = 0;

        while (end < s.length()) {
            if(!value.contains(s.charAt(end))) {
                value.add(s.charAt(end++));
                count = Math.max(count, value.size());
            } else {
                value.remove(s.charAt(start++));
            }
        }
        return count;
    }

    // Sliding Window
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();

        int res = 0;
        int[] cnt = new int[128];
        for(int L=0, R=0; R<n; R++) {
            cnt[s.charAt(R)]++;

            while(cnt[s.charAt(R)] > 1)
                cnt[s.charAt(L++)]--;

            res = Math.max(res, R-L+1);
        }

        return res;
    }
    // https://www.youtube.com/watch?v=xzRYqeoPyLk



}
