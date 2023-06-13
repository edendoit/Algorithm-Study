public class No5 {
    public String longestPalindrome(String s) {
        int[] ans = new int[]{0,0};

        for(int i=0; i<s.length(); i++) {
            int odd = expand(i, i, s);
            if(odd > ans[1]-ans[0]+1) {
                int dist = odd/2;
                ans[0] = i-dist;
                ans[1] = i+dist;
            }

            int even = expand(i, i+1, s);
            if(even > ans[1]-ans[0]+1) {
                int dist = (even/2)-1;
                ans[0] = i-dist;
                ans[1] = i+1+dist;
            }
        }

        int i = ans[0];
        int j = ans[1];
        return s.substring(i, j+1);
    }

    private int expand(int i, int j, String s) {
        int left = i;
        int right = j;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    // https://leetcode.com/problems/longest-palindromic-substring/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
