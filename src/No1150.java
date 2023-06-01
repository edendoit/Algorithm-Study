public class No1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        if(target == nums[0] && nums.length == 1) return true;
        int maj = nums.length/2;
        int freq = 0, i=0;

        while(i < nums.length) {
            if(nums[i] == target) freq++;
            i++;
        }
        return freq>maj;
    }
}
