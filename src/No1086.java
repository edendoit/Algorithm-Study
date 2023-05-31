import java.util.*;

public class No1086 {
    private int K;
    public int[][] highFive(int[][] items) {
        this.K = 5;
        Map<Integer, Queue<Integer>> map = new TreeMap<>();
        for(int[] item : items) {
            int id = item[0];
            int score = item[1];
            if(!map.containsKey(id))
                map.put(id, new PriorityQueue<>());

            // min heap에 점수 넣기
            map.get(id).add(score);

            // min heap의 사이즈가 5가 넘으면 최솟값 지우기
            if(map.get(id).size() > this.K)
                map.get(id).poll();
        }

        List<int[]> sol = new ArrayList<>();
        for(int id : map.keySet()) {
            int sum = 0;
            for(int i=0; i<this.K; i++) {
                sum += map.get(id).poll();
            }
            sol.add(new int[]{id, sum/this.K});
        }
        int [][] arr = new int[sol.size()][];
        return sol.toArray(arr);
    }
}
// https://leetcode.com/problems/high-five/editorial/?envType=study-plan-v2&envId=premium-algo-100