import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class No567 {
    public boolean checkInclusion(String s1, String s2) {

        int start = 0;
        if(s1.length() > s2.length() || s1 == null || s2 == null)
            return false;
        if(s1.length() == 0)
            return true;
        s1 = sort(s1);

        while(start < (s2.length() - s1.length()+1)) {
            String str = s2.substring(start, start+s1.length());

            if(s1.equals(sort(str))) {
                return true;
            } else {
                start++;
            }
        }
        return false;

    }

    public String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }

}
