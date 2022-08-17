public class No413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int current = 0, sum = 0;

        for(int i=2; i<nums.length; i++) {

            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                current += 1;
                sum += current;
            } else {
                current = 0;
            }

        }
        return sum;
    }
}
