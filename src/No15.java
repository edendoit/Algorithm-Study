import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int n= nums.length;
        if(n<3) return res;

        Arrays.sort(nums);

        for(int i=0; i<n; i++) {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int L = i+1, R = n-1;

            while(L<R) {
                int curSum = nums[i]+nums[L]+nums[R];
                if(curSum == 0) {
                    List<Integer> sub = new LinkedList();
                    sub.add(nums[i]);
                    sub.add(nums[L]);
                    sub.add(nums[R]);
                    res.add(sub);

                    L++;
                    R--;

                    while(L<R && nums[L]==nums[L-1]) { L++;}
                    while(L<R && nums[R]==nums[R+1]) { R--;}

                }
                else if (curSum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=VpPbwSGQOlY