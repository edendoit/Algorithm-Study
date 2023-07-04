import java.util.HashMap;
import java.util.Map;

public class No137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int result = 0;
        for (int keys : map.keySet()) {
            if(map.get(keys)==1)result = keys;
        }
        return result;
    }
}
