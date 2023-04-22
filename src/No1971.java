import java.util.*;

public class No1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // 그래프 그리기
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges) {
            int a = edge[0], b=edge[1];
            graph.computeIfAbsent(a, val->new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val->new ArrayList<Integer>()).add(a);
        }

        boolean[] seen = new boolean[n];
        seen[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            if(cur == destination) {
                return true;
            }

            // 모든 이웃들에 대하여 현재 노드가 전에 방문한적이 없다면
            // queue 에 추가하여 방문했다고 표시하기
            for(int nextNode : graph.get(cur)) {
                if(!seen[nextNode]) {
                    seen[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
        return false;
    }
}
// https://leetcode.com/problems/find-if-path-exists-in-graph/editorial/