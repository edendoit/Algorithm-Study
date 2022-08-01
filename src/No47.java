import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();

        int begin = 0;
        for(int i=0; i<nums.length; i++) {
            int size = result.size();
            for(int j=begin; j<size; j++) {
                List<Integer> cur = new ArrayList<Integer>(result.get(j));
                cur.add(nums[i]);
                result.add(cur);
            }
            begin = size;
        }
        return result;

    }
}

// https://leetcode.com/problems/permutations-ii/discuss/2339676/java-oror-easy-and-Recursive-solution-oror-faster-then-98
// https://leetcode.com/problems/permutations-ii/discuss/2351478/Java-Solution