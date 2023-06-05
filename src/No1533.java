 interface ArrayReader {
      // Compares the sum of arr[l..r] with the sum of arr[x..y]
             // return 1 if sum(arr[l..r]) > sum(arr[x..y])
             // return 0 if sum(arr[l..r]) == sum(arr[x..y])
             // return -1 if sum(arr[l..r]) < sum(arr[x..y])
             public default int compareSub(int l, int r, int x, int y) {
                 return l;
             }

             // Returns the length of the array
             public default int length() {
                 return 0;
             }
  }
public class No1533 {
    public int getIndex(ArrayReader reader) {
        int len = reader.length();
        int start = 0, end = len-1;
        while(start < end) {
            int mid = start + (end-start)/2;
            int res;
            if((end-start)%2==0) {
                res = reader.compareSub(start, mid, mid, end);
            } else {
                res = reader.compareSub(start, mid, mid+1, end);
            }

            if(res==1) {
                end = mid;
            } else if (res==-1) {
                start = mid+1;
            } else if (res==0) {
                start = mid;
            }
        }
        return start;
    }
}
// https://leetcode.com/problems/find-the-index-of-the-large-integer/solutions/926651/java-they-key-is-to-handle-odd-and-even-number-of-elements-separately/?envType=study-plan-v2&envId=premium-algo-100