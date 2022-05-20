public class No34 {
    public static int[] searchRange(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int[] result = {-1, -1};
        if(nums.length==0) {
            return result;
        }
        while (nums[start] < nums[end]) {
            int mid = start + (end - start)/2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                if(nums[start] == nums[mid]) {
                    end--;

                } else {
                    start++;
                }
            }
        }
        if(nums[start]==nums[end] && nums[start]==target) {
            result[0] = start;
            result[1] = end;
        }
        return result;

        }

    }





