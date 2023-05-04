public class No1768 {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        if(word1.length() > word2.length()) {
            for(int i=0; i<word2.length(); i++) {
                res += word1.charAt(i);
                res += word2.charAt(i);
            }
            res += word1.substring(word2.length(), word1.length());
        } else if(word1.length() < word2.length()) {
            for(int i=0; i<word1.length(); i++) {
                res += word1.charAt(i);
                res += word2.charAt(i);
            }
            res += word2.substring(word1.length(), word2.length());
        } else if(word1.length() == word2.length()) {
            for(int i=0; i<word1.length(); i++) {
                res += word1.charAt(i);
                res += word2.charAt(i);
            }
        }
        return res;
    }
}
