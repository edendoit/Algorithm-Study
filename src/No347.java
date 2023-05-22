import java.util.*;

public class No347 {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1 || nums.length == k) {
            return nums;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        // map에 원소(key)와 빈도수(value) 넣기
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);

            }
        }

        // map에 value 크기대로 (오름차순) 정렬
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));

        for(Integer key : keys) {
            arr.add(key);
        }

        int[] res = new int[k];
        for(int i=0; i<k; i++) {

            res[i] = arr.indexOf(arr.size()-i);
        }



        return res;

    }
}
