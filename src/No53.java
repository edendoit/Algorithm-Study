public class No53 {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for(int i=1; i<nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public int maxSubArray2(int[] nums) {
        int cur = nums[0];
        int maxArr = nums[0];

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            cur = Math.max(num, num+cur);
            maxArr = Math.max(maxArr, cur);
        }
        return maxArr;
    }
}
