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
}

// https://www.youtube.com/watch?v=CYnvDzMprdc