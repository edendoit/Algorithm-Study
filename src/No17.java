import java.util.LinkedList;
import java.util.List;

public class No17 {
    private static final String[] KEYS = {"", "", "abc", "def", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ret = new LinkedList<String>();
        comb("", digits, 0, ret);
        return ret;
    }

    private void comb(String prefix, String digits, int offset, List<String> ret) {
        if(offset >= digits.length()) {
            ret.add(prefix);
            return;
        }

        String letters = KEYS[(digits.charAt(offset) - '0')];
        for(int i=0; i<letters.length(); i++) {
            comb(prefix + letters.charAt(i), digits, offset+1, ret);
        }
    }
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/8109/My-recursive-solution-using-Java
}
