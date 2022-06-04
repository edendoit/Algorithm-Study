public class No704 {
    // 704 Binary Search
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(target == nums[mid]) {
                return mid;
            }
            if(target > nums[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12},9));
    }
}
