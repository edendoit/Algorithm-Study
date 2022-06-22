import java.util.HashMap;
import java.util.Map;

public class No169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;

        // HashMap에 값 넣기
        for(int num : nums) {
            // 이미 값이 있다면 count를 올려서 다시 저장
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }
            else
                map.put(num, map.get(num)+1);
            if(map.get(num) > nums.length/2) {
                count = num;
                break;
            }
        }

        return count;
    }

}
