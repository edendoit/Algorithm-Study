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


}
