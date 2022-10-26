import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        if (p.length() > s.length()) return result;
        int[] a = new int[26];
        for (char ch : p.toCharArray()) {
            a[ch -'a']++;
        }
        int[] b = new int[26];
        for (int l = 0, r = 0; r < s.length(); r++) {
            b[s.charAt(r) - 'a']++;
            if (r - l + 1 == p.length()) {
                if (Arrays.equals(a, b)) result.add(l);
                b[s.charAt(l++) -'a']--;
            }
        }
        return result;

    }

    public List<Integer> findAnagrams2(String s, String p) {
        int[] cnt = new int[128];
        for (char c : p.toCharArray()) cnt[c]++;

        List<Integer> ans = new ArrayList<>();
        for (int r = 0, l = 0; r < s.length(); ++r) {
            char c = s.charAt(r);
            cnt[c]--;
            while (cnt[c] < 0) { // If number of characters `c` is more than our expectation
                cnt[s.charAt(l)]++;  // Slide left until cnt[c] == 0
                l++;
            }

            if (r - l + 1 == p.length()) { // If we already filled enough `p.length()` chars
                ans.add(l); // Add left index `l` to our result
            }
        }
        return ans;
    } // https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/639309/JavaPython-Sliding-Window-Detail-explanation-Clean-and-Concise
}
