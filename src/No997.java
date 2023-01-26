public class No997 {
    public int findJudge(int N, int[][] trust) {
        if(trust.length < N-1) {
            return -1;
        }
        int [] indegree = new int[N+1];
        int [] outdegree = new int[N+1];

        for(int[] relation : trust) {
            indegree[relation[1]]++;
            outdegree[relation[0]]++;
        }
        for(int i=1; i<=N; i++) {
            if(indegree[i] == N-1 && outdegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
