import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class No461 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        backtrack(new LinkedList<Integer>(), 0, nums, res);
        return res;
    }
    public void backtrack(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res) {
        if(list.size()>1) res.add(new LinkedList<Integer>(list));
        Set<Integer> used = new HashSet<>();

        for(int i=index; i<nums.length; i++) {
            if(used.contains(nums[i])) continue;
            if(list.size() == 0 || nums[i] >= list.peekLast()) {
                used.add(nums[i]);
                list.add(nums[i]);
                backtrack(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }


    }
}

// https://leetcode.com/problems/non-decreasing-subsequences/solutions/97147/java-solution-beats-100/