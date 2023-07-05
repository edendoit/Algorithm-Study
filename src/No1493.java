public class No1493 {
    public int longestSubarray(int[] nums) {
        int zeroCnt=0, len=0, start=0;
        for(int i=0; i<nums.length; i++) {
            zeroCnt += (nums[i]==0 ? 1 : 0);
            while(zeroCnt>1) {
                zeroCnt -= (nums[start]==0 ? 1 : 0);
                start++;
            }
            len = Math.max(len, i-start);
        }
        return len;

    }
    // https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/editorial/
}
