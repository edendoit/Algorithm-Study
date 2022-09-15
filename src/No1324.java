import java.util.ArrayList;
import java.util.List;

public class No1324 {
    public List<String> printVertically(String s) {
        String[] str = s.trim().split(("\\s+"));
        int mx = 0;
        List<String> res = new ArrayList();

        for(int i=0; i<str.length; ++i) {
            mx = Math.max(mx, str[i].length());
        }
        for(int i=0; i<mx; ++i) {
            StringBuilder sb = new StringBuilder();
            for(String word : str)
                sb.append(i<word.length() ? word.charAt(i) : " ");
            while(sb.charAt(sb.length()-1) == ' ')
                sb.deleteCharAt(sb.length()-1);
            res.add(sb.toString());
        }
        return res;
    }
}
// https://leetcode.com/problems/print-words-vertically/discuss/484322/JavaPython-3-Straight-forward-codes-w-brief-explanation-and-analysis.