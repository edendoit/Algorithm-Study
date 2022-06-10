import java.util.HashSet;
import java.util.Set;

public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();
        Set<Integer> intersec = new HashSet<>();

        for(int i=0; i<nums1.length; i++) {
            result.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++) {

            if(result.contains(nums2[j])) {
                intersec.add(nums2[j]);
                }
            }


        int[] output = new int[intersec.size()];
        int k=0;
        for(Integer num : intersec) {
            output[k++] = num;
        }
        return output;

    }

}
