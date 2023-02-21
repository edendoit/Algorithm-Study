public class No540 {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i=0; i<nums.length/2; i++) {
            if(nums[2*i] != nums[2*i+1]) {
                return nums[2*i];
            }
        }
        return nums[nums.length-1];
    }
}
// brute force
// Time complexity O(n)
// Space complexity O(1)
