import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No189 {
    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length == 0){
            return;
        }
        int[] result = new int[nums.length];
        k = k % nums.length;

        for(int i=0; i<nums.length; i++) {
            if(i<k) {
                result[i] = nums[nums.length-k+i];
            }else {
                result[i] = nums[i-k];
            }

        }
        for(int i=0; i<nums.length; i++) {
            nums[i]= result[i];
        }
    }

    public static void rotate2(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            res[(i + k) % nums.length] = nums[i];
            System.out.println((i + k) + " => i, k");

            System.out.println(res[(i + k) % nums.length] + " => res[(i + k) % nums.length]");
            System.out.println(nums[i] + " => nums[i]");
            System.out.println( "=============================");
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = res[i];
        }

    }

    public static void main(String[] args) {
        rotate2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    // https://leetcode.com/problems/rotate-array/solutions/127713/official-solution/
}
