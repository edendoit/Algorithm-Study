public class No1180 {
    public int countLetters(String s) {
        int sub[] = new int[s.length()];
        int total=1;
        sub[0]=1;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)) {
                sub[i] = sub[i-1]+1;
            } else {
                sub[i]=1;
            }
            total += sub[i];
        }
        return total;

    }
}
// https://leetcode.com/problems/count-substrings-with-only-one-distinct-letter/editorial/?envType=study-plan-v2&envId=premium-algo-100