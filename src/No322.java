import java.util.LinkedList;
import java.util.Queue;

public class No322 {
//    public int coinChange(int[] coins, int amount) {
//        if (amount == 0) return 0;
//
//        Queue<Integer> queue = new LinkedList<>();
//        boolean[] visited = new boolean[amount + 1];
//        queue.offer(amount);
//        visited[amount] = true;
//        int currLevel = 1;
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                int cur = queue.poll();
//                for (int coin : coins) {
//                    int child = cur - coin;
//                    if (child == 0) {
//                        return currLevel;
//                    } else if (child > 0 && !visited[child]) {
//                        queue.add(child);
//                        visited[child] = true;
//                    }
//                }
//            }
//            currLevel++;
//        }
//        return -1;
//    }
    // https://leetcode.com/problems/coin-change/solutions/77368/java-both-iterative-and-recursive-solutions-with-explanations/


    public int coinChange(int[] coins, int amount) {
        int max = amount+1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, max);
        dp[0]=0;
        for(int i=1; i<=amount; i++) {
            for(int j=0; j<coins.length; j++) {
                if(coins[j]<=i) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    // https://leetcode.com/problems/coin-change/editorial/
}

