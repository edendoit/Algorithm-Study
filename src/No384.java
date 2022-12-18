import java.util.Random;

public class No384 {
    public int[] nums;
    public Random random;

    public No384(int[] nums) {
        this.nums = nums;
        random  = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = nums.clone();
        for(int j=1; j<a.length; j++) {
            int i = random.nextInt(j+1);
            swap(a, i, j);
        }
        return a;
    }
    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
