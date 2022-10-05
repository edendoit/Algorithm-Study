import java.util.HashMap;
import java.util.Map;

public class No1376 {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, Integer> times = new HashMap();
        int max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, dfs(i, manager, informTime, times));
        }
        return max;
    }

    private int dfs(int emp, int[] manager, int[] informTime, Map<Integer, Integer> time) {
        if(manager[emp] == -1) return 0;

        if(time.containsKey(emp)) return time.get(emp);
        time.put(emp, informTime[manager[emp]] + dfs(manager[emp], manager, informTime, time));

        return time.get(emp);
    }
}
// https://leetcode.com/problems/time-needed-to-inform-all-employees/discuss/589738/Java-DFS-%2B-Memoization-(w-Explanation-and-Complexity-Analysis)