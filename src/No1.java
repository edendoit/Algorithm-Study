public class No1 {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int i=0, j=1;

        while(i < (nums.length-1)) {
            if(j < nums.length) {
                if((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                } else {
                    j++;
                }
            }else {

                i++;
                j = (i+1);
            }
        }
        return new int[]{};
    }

}
