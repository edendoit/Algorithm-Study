import java.util.*;

public class No797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList();
        Queue<List<Integer>> q = new LinkedList();
        q.add(Arrays.asList(0));

        int goalNode = graph.length - 1;

        while(!q.isEmpty()) {
            List<Integer> path = q.poll();
            int lastNode = path.get(path.size() -1);

            if(lastNode == goalNode) {
                result.add(new ArrayList<>(path));
            } else {
                int[] neighbors = graph[lastNode];
                for(int neighbor : neighbors) {
                    List<Integer> list = new ArrayList<>(path);
                    list.add(neighbor);
                    q.add(list);
                }
            }
        }
        return result;

    }
// https://www.youtube.com/watch?v=CYnvDzMprdc

    public List<List<Integer>> allPathsSourceTarget2(int[][] graph) {
        if(graph == null || graph.length == 0) return null;
        int n = graph.length;

        List<Integer> cur = new ArrayList();
        List<List<Integer>> answer = new ArrayList();
        cur.add(0);
        dfs(graph, 0, n-1, cur, answer);

        return answer;
    }

    private void dfs(int[][] graph, int source, int target, List<Integer> cur, List<List<Integer>> answer) {
        if(source == target) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for(int child : graph[source]) {
            cur.add(child);
            dfs(graph, child, target, cur, answer);
            cur.remove(cur.size()-1);
        }
    } // https://leetcode.com/problems/all-paths-from-source-to-target/discuss/297408/Java-DFS-solution-Easy-to-understand-and-Explanation
}

