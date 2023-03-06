public class No912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (high-low) / 2 + low;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            mergeFun(arr, low, mid, high);
        }
    }
    public static void mergeFun(int[] arr, int low, int mid, int high) {
        int n1 = mid+1-low; // mid - low + 1
        int n2 = high-mid; // high - mid
        int[] left = new int[n1];

        for(int i=0; i<n1; i++) {
            left[i] = arr[low+i];
        }

        int[] right = new int[n2];
        for(int i=0; i<n2; i++) {
            right[i] = arr[mid+1+i];

        }
        int i=0, j=0, k=low;
        while(i<n1 || j<n2) {
            if(j == n2 || i<n1 && left[i]<right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
    }
}

// https://leetcode.com/problems/sort-an-array/solutions/3241753/java-merge-sort-easy/