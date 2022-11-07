public class No209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0, n=nums.length, res=n+1;

        for(int j=0; j<n; ++j) {
            System.out.print(j+" 번째 : target="+target+" ");
            target -= nums[j];
            System.out.println("  nums[j]="+nums[j]+ " 바뀐 target="+target);

            while(target <= 0) {
                System.out.println();
                System.out.println("res="+res+", j-i+1="+(j-i+1));
                res = Math.min(res, j-i+1);
                System.out.print("  target="+target);
                target += nums[i++];
                System.out.println("  ====> target="+target);
                System.out.println();
            }
        }
        System.out.println(res % (n+1));
        return res % (n+1);
    }

    public static void main(String[] args) {
        int [] ex = {2, 3, 1, 2, 4, 3};
        minSubArrayLen(7, ex);
    }
}
