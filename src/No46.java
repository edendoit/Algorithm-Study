import java.util.ArrayList;
import java.util.List;

public class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, nums, 0);
        return result;
    }
    private void permute(List<List<Integer>> result, int[] array, int start) {
        if(start >= array.length) {
            List<Integer> current = new ArrayList<>();
            for(int a:array) {
                current.add(a);
            }
            result.add(current);
        } else {
            for (int i=start; i<array.length; i++) {
                swap(array, start, i);
                permute(result, array, start+1);
                swap(array, start, i);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
