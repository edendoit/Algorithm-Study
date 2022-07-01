import java.util.*;

public class No763 {
    public static List<Integer> partitionLabels(String s) {
        LinkedList<Integer> res = new LinkedList();
        Map<Character, Integer> map = new HashMap();

        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        int[] index = new int[map.size()];
        int cnt = 0;
        Iterator<Map.Entry<Character, Integer>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Character, Integer> entry = entries.next();
            index[cnt] = entry.getValue();
            cnt++;
        }

        int count = index[0];
        res.add(index[0]+1);
        for(int i=1; i<map.size()-1; i++) {
            if(index[i] > index[i+1]) {

                    res.add(index[i]-count);
                    count = index[i];
            } else if (index[i] == index[i+1]) {
                res.add(index[i]-count);
            }
        }
        System.out.println("res ===> "+ res);

        return res;
    }

    public static void main(String[] args) {
        partitionLabels("eccbbbbdec");
        partitionLabels("ababcbacadefegdehijhklij");
    }

}
