public class No1228 {
    public int missingNumber(int[] arr) {
        int N = arr.length;

        int d = (arr[N-1]-arr[0])/N;

        int i = arr[0];
        for(int j:arr) {
            if(i!=j)
                break;
            i+=d;
        }
        return i;
    }
}
