import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// before modifying
public class No39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
        if(target > 0) {
            for(int i=start; i<candidates.length && target>=candidates[i]; i++) {
                temp.add(candidates[i]);
                backtrack(result, temp, candidates, target-candidates[i], i);
                temp.remove(temp.size()-1);
            }
        }
        else if(target == 0) {
            result.add(new ArrayList<Integer>(temp));
        }


    }
}
