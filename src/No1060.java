public class No1060 {
    public int missingElement(int[] nums, int k) {
        int n = nums.length;
        int start = 0, end = n-1;

        while(start < end) {
            int mid = end-(end-start)/2;
            if(nums[mid]-nums[0]-mid < k) {
                start = mid;
            } else {
                end = mid-1;
            }
        }
        return nums[0]+k+start;
    }
}
// https://leetcode.com/problems/missing-element-in-sorted-array/editorial/?envType=study-plan-v2&envId=premium-algo-100