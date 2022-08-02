import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        permutation(nums, visited, res, new ArrayList());

        return res;
    }
    public static void permutation(int[] nums, boolean[] visited, List<List<Integer>> res, List<Integer> ans) {

        if(ans.size() == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0; i<nums.length; i++) {

            if(visited[i] == false){
                if(i>0 && nums[i-1] == nums[i] && !visited[i-1]) continue;
                ans.add(nums[i]);
                visited[i] = true;

                permutation(nums, visited, res, ans);

                ans.remove(ans.size()-1);
                visited[i] = false;
            }
        }
    }
}

// https://leetcode.com/problems/permutations-ii/discuss/2339676/java-oror-easy-and-Recursive-solution-oror-faster-then-98
