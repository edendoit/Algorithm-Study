import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();

        list.add(new ArrayList());
        for(int n : nums) {
            int size = list.size();
            for(int i=0; i<size; i++) {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(n);
                list.add(subset);
            }
        }
        return list;

        // https://leetcode.com/problems/subsets/discuss/122645/3ms-easiest-solution-no-backtracking-no-bit-manipulation-no-dfs-no-bullshit



    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);

        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for(int i=start; i<nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i+1);
            tempList.remove(tempList.size() -1);
        }
    }

    // https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
}

