import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, nums, 0);
        return result;
    }
    private void permute(List<List<Integer>> result, int[] array, int start) {
        if(start >= array.length) {
            List<Integer> current = new ArrayList<>();
            for(int a:array) {
                current.add(a);
            }
            result.add(current);
        } else {
            for (int i=start; i<array.length; i++) {
                swap(array, start, i);
                permute(result, array, start+1);
                swap(array, start, i);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;


    }

    public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start) {
        list.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++) {
            temp.add(nums[i]);
            backtrack(list, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }

    }
    // https://leetcode.com/problems/permutations/solutions/18239/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partioning/?orderBy=most_votes

}
