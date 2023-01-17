public class No926 {
    public int minFlipsMonoIncr(String s) {
        int res = 0, num = 0;
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0') {
                res = Math.min(num, res+1);
            } else {
                num++;
            }
        }
        return res;
    }
}
// https://leetcode.com/problems/flip-string-to-monotone-increasing/solutions/2912351/flip-string-to-monotone-increasing/