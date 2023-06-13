import java.util.List;

public class No139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        for(int i=0; i<s.length(); i++) {
            for(String word : wordDict) {
                if(i<word.length()-1) {
                    continue;
                }

                int a = i-word.length();
                if(i==word.length()-1 || dp[i-word.length()]) {
                    String st = s.substring(i-word.length()+1, i+1);
                    if(s.substring(i-word.length()+1, i+1).equals(word)) {
                        dp[i]=true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()-1];
    }
    // https://leetcode.com/problems/word-break/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
