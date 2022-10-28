public class No1876 {
    public int countGoodSubstrings(String s) {
        int res = 0;

        for(int i= 2; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i-2) && s.charAt(i-1) != s.charAt(i-2)) res++;

        }
        return res;
    }
}
// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/discuss/1429825/Java-simple-O(n)-100