import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());

        int begin = 0;
        for(int j=0; j<nums.length; j++) {
            if(j==0 || nums[j] != nums[j-1]) begin = 0;
            int size = list.size();
            for(int i=0; i<size; i++) {
                List<Integer> subset = new ArrayList<>(list.get(i));
                subset.add(nums[j]);
                if(!list.contains(subset)){
                    list.add(subset);
                }

            } begin = size;
        }
        return list;
    }
}
