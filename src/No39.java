import java.util.ArrayList;
import java.util.List;

// before modifying
public class No39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();

        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
        int sum = 0;
        for(int i=start; i<candidates.length; i++) {
            if(sum < target) {
                sum = 0;
                start = 0;
                //temp.remove(temp.size()-1);
            } else if(sum > target) {
                sum += candidates[i];
                target -= candidates[i];
                temp.add(candidates[i]);
                backtrack(result, temp, candidates, target, i+1);
                temp.remove(temp.size()-1);

            }
        }
    }
}
