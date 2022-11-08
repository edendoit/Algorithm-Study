public class No1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0, j=0, oddCount=0, count=0, temp=0;

        while(j<nums.length) {
            if(nums[j] % 2 == 1) {
                oddCount++;
                temp=0;
            }
            while(oddCount==k) {
                temp++;
                if(nums[i] % 2 == 1) {
                    oddCount--;
                }i++;
            }
            count += temp;
            j++;
        }
        return count;
    }
}
// https://leetcode.com/problems/count-number-of-nice-subarrays/solutions/2500001/java-sliding-window-two-pinter/