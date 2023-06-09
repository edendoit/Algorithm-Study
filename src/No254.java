import java.util.ArrayList;
import java.util.List;

public class No254 {
    public List<List<Integer>> getFactors(int n) {

        List<List<Integer>> res = new ArrayList<>();
        combination(res, new ArrayList<Integer>(), n, 2);
        return res;
    }

    void combination(List<List<Integer>> res, List<Integer> item, int n, int start) {
        if(n<=1) {
            if(item.size() > 1) {
                res.add(new ArrayList<Integer>(item));
            }
            return;
        }

        for(int i=start; i<=n; i++) {
            if(n%i==0) {
                item.add(i);
                combination(res, item, n/i, i);
                item.remove(item.size()-1);
            }
        }


    }
}
// https://leetcode.com/problems/factor-combinations/solutions/68040/my-recursive-dfs-java-solution/?envType=study-plan-v2&envId=premium-algo-100