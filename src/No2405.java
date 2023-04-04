import java.util.HashSet;
import java.util.Set;

public class No2405 {
    public int partitionString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i=0, cnt=0;
        while(i<n) {
            char ch = s.charAt(i);
            // set 안에 존재하지 않으면
            if(!set.contains(ch)) {
                set.add(ch);
                i++;
            } // 이미 존재한다면 초기화
            else {
                set.clear();
                cnt++;

            }
        }
        if(!set.isEmpty()) {
            cnt++;
        }
        return cnt;
    }
}
