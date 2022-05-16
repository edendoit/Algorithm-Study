import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No189 {
    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length == 0){
            return;
        }
        int[] result = new int[nums.length];
        k = k % nums.length;

        for(int i=0; i<nums.length; i++) {
            if(i<k) {
                result[i] = nums[nums.length-k+i];
            }else {
                result[i] = nums[i-k];
            }

        }
        for(int i=0; i<nums.length; i++) {
            nums[i]= result[i];      }
    }
}
