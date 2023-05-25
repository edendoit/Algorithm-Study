public class No346 {
    int size;
    int[] nums;
    // 생성자
    public No346(int size) {
        this.size = size;
        nums = new int[size];
    }
    int head=0, sum=0, cnt=0;
    public double next(int val) {
        cnt++;
        int end = (head+1) % size;
        sum = sum - nums[end] + val;
        head = (head+1) % size;
        nums[head] = val;
        return sum * 1.0 / Math.min(size, cnt);
    }
}
// https://leetcode.com/problems/moving-average-from-data-stream/submissions/957134105/?envType=study-plan-v2&id=premium-algo-100