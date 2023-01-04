import java.util.HashMap;
import java.util.Map;

public class No2244 {
    public static int minimumRounds(int[] tasks) {
        if(tasks.length < 2) return -1;
        Map<Integer, Integer> map = new HashMap<>();

        // key에 tasks[i] value 에 순번
        for(int i=0; i<tasks.length; i++) {
            if(i==0) {
                System.out.println("1. " + tasks[i] );
                map.put(tasks[i], 1);
            } else if(map.containsKey(tasks[i])){
                map.put(tasks[i], (1 + map.get(tasks[i])));
                System.out.println("2. " + tasks[i] + "///  get => "+map.get(tasks[i]));
            } else {
                map.put(tasks[i],1);
                System.out.println("3. " + tasks[i] + "///  i => "+i);
            }
        }

        System.out.println(map);

        int count = 0;

        for(int i=0; i<map.size(); i++) {
            System.out.println("R은 "+i+"  " + map.get(tasks[i]) );

            if(map.get(tasks[i]) < 2)  {
                return -1;
            } else if(map.get(tasks[i]) == 2) {
                count++;
            } else if((map.get(tasks[i]) % 3) != 1) {
                count += ((map.get(tasks[i]) / 3)) + ((map.get(tasks[i]) % 3) / 2);
            } else if((map.get(tasks[i]) % 3) == 1) {
                count += (((map.get(tasks[i])+1) / 3)) + (((map.get(tasks[i])+1) % 3) / 2);
            }
        }
        return count;



    }

    public static void main(String[] args) {
        int[] a = {2,2,3,3,2,4,4,4,4,4};
        minimumRounds(a);
    }
}
