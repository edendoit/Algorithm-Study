public class No76 {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = 0;
        int[] req = new int[256];

        for(char c : t.toCharArray()) {
            if(++req[c] == 1)
                m++;
        }
        String res="";
        int charCount = 0;
        int[] cnt = new int[256];

        for (int L = 0, R = 0; R < n; R++) {
            // update right
            if (++cnt[s.charAt(R)] == req[s.charAt(R)])
                charCount++;

            // update left
            if (charCount == m) {
                do {
                    int c = s.charAt(L++);
                    if (--cnt[c] < req[c])
                        charCount--;
                } while (charCount == m);

                // update answer - [L-1, R]
                int len = R - L + 2;
                if (res.isEmpty() || res.length() > len)
                    res = s.substring(L - 1, len+L-1);
            }
        }

        return res;
    }
}
// https://www.youtube.com/watch?v=f9xL16rv9K8