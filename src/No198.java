public class No198 {
    public int rob(int[] nums) {
        int N = nums.length;
        if(N==0) return 0;

        int step1 = nums[N-1];
        int step2 = 0;

        for(int i=N-2; i>=0; i--) {
            int cur = Math.max(step1, step2+nums[i]);
            step2 = step1;
            step1 = cur;
        }

        return step1;
    }
    // https://leetcode.com/problems/house-robber/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
