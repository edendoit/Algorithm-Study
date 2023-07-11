import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No1133 {
    public int largestUniqueNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(map.getOrDefault(nums[i], 0)==1){
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }
}
