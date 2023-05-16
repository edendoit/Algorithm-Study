import java.util.HashMap;
import java.util.Map;

public class No1056 {
    public boolean confusingNumber(int n) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        StringBuilder sb = new StringBuilder();

        for(char ch: String.valueOf(n).toCharArray()) {
            // map에 없으면 거짓 반환
            if(!map.containsKey(ch)) {
                return false;
            }
            sb.append(map.get(ch));
        }

        sb.reverse();
        return Integer.parseInt(sb.toString()) != n ;

    }
}
// https://leetcode.com/problems/confusing-number/editorial/?envType=study-plan-v2&id=premium-algo-100
