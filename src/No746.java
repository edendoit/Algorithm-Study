public class No746 {
    public int minCostClimbingStairs(int[] cost) {
        // int minCost[] = new int[cost.length+1];

        // for(int i=2; i<minCost.length; i++) {
        //     int step1 = minCost[i-1]+cost[i-1];
        //     int step2 = minCost[i-2]+cost[i-2];
        //     minCost[i] = Math.min(step1, step2);
        // }

        // return minCost[minCost.length-1];

        int step1=0;
        int step2=0;
        for(int i=2; i<cost.length+1; i++) {
            int tmp = step1;
            step1 = Math.min(step1+cost[i-1], step2+cost[i-2]);
            step2 = tmp;
        }
        return step1;
    }
    // https://leetcode.com/problems/min-cost-climbing-stairs/editorial/?envType=study-plan-v2&envId=dynamic-programming
}
