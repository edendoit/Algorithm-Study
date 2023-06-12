import java.util.List;

public class No120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        // list 에서 어떻게 처리해야하는지..?
        if(triangle.size()==0) return 0;

        for(int i=triangle.size()-2; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                List<Integer> next = triangle.get(i+1);
                int sum = Math.min(next.get(j), next.get(j+1))+triangle.get(i).get(j);
                triangle.get(i).set(j, sum);
            }
        }
        return triangle.get(0).get(0);
    }
    // https://leetcode.com/problems/triangle/solutions/38730/dp-solution-for-triangle/comments/36542
}
