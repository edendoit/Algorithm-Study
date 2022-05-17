import java.util.ArrayList;

public class No283 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++) {
             if(nums[i] != 0) {
                arrList.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(i<arrList.toArray().length) {
                nums[i] = arrList.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }
}
