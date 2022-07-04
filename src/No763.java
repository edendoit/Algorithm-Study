import java.util.*;
public class No763 {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,i);
        }

        List<Integer> res = new LinkedList();
        int prev = -1;
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));

            // 끝에 달았을때
            if(max == i) {
                res.add(max - prev) ;
                prev = max;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        partitionLabels("eccbbbbdec");
//        partitionLabels("ababcbacadefegdehijhklij");
    }

}
