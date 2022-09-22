public class No1347 {
    public int minSteps(String s, String t) {
        int n = s.length();
        int[] cntS = new int[26];
        int[] cntT = new int[26];

        for(int i=0; i<n; i++) {
            cntS[s.charAt(i)-'a']++;
            cntT[t.charAt(i)-'a']++;
        }

        int res = 0;
        for(int i=0; i<26; i++) {
            res += Math.abs(cntS[i]-cntT[i]);
        }
        return res/2;
    }
}

// https://www.youtube.com/watch?v=kc_i0O7MvBU