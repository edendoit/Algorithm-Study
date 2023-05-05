import java.util.Set;

public class No1456 {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int cnt = 0;
        for(int i=0; i<k; i++) {
            // k 길이까지 모음 포함하는 갯수
            cnt += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int ans = cnt;

        // k 부터 s 길이까지
        for(int i=k; i<s.length(); i++) {
            cnt += vowels.contains(s.charAt(i)) ? 1 : 0;
            cnt -= vowels.contains(s.charAt(i-k)) ? 1 : 0;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/editorial/