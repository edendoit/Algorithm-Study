import java.util.HashSet;
import java.util.Set;

public class No266 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else
                set.remove(s.charAt(i));
        }
        return set.size()==0 || set.size()==1;
    }
    // https://leetcode.com/problems/palindrome-permutation/solutions/69582/java-solution-w-set-one-pass-without-counters/?envType=study-plan-v2&envId=premium-algo-100
}
