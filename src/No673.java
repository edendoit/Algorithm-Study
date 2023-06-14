public class No673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] len = new int[n];
        int[] cnt = new int[n];

        int maxLength = 0, res=0;
        for(int i=0; i<n; i++) {
            len[i]=1;
            cnt[i]=1;
            for(int j=0; j<i; j++) {
                if(nums[j]<nums[i]) {
                    if(len[j]+1>len[i]) {
                        len[i] = len[j]+1;
                        cnt[i] = cnt[j];
                    } else if(len[j]+1 == len[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, len[i]);
        }

        for(int i=0; i<n; i++) {
            if(len[i] == maxLength) {
                res += cnt[i];
            }
        }
        return res;
    }
}
