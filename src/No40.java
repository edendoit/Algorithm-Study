import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;




    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] cand, int remain, int start) {
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(temp));
        else {
            for(int i=start; i<cand.length; i++) {
                if(i > start && cand[i] == cand[i-1]) continue;
                temp.add(cand[i]);
                backtrack(list, temp, cand, remain-cand[i], i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    // https://leetcode.com/problems/combination-sum-ii/discuss/16878/Combination-Sum-I-II-and-III-Java-solution-(see-the-similarities-yourself)
}
