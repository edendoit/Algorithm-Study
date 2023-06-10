import java.util.HashMap;
import java.util.Map;

public class No740 {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> points = new HashMap<>();
        int maxNum = 0;

        // map 에 nums의 숫자 횟수를 key, value로 입력 후 제일 큰 숫자 저장
        for(int num : nums) {
            points.put(num, points.getOrDefault(num, 0)+num);
            maxNum = Math.max(maxNum, num);
        }

        int[] maxPoints = new int[maxNum+1];
        maxPoints[1] = points.getOrDefault(1, 0);

        for(int num = 2; num<maxPoints.length; num++) {
            int gain = points.getOrDefault(num, 0);
            maxPoints[num] = Math.max(maxPoints[num-1], maxPoints[num-2]+gain);
        }
        return maxPoints[maxNum];

    }
}
// https://leetcode.com/problems/delete-and-earn/editorial/?envType=study-plan-v2&envId=dynamic-programming