import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList();
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                res.add(i);
            }
        }
        return res;



    }
}
