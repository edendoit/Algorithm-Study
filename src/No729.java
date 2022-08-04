import java.util.ArrayList;
import java.util.List;

public class No729 {
    class MyCalendar {

        List<int[]> scale;

        public MyCalendar() {
            scale = new ArrayList();
        }

        public boolean book(int start, int end) {
            for(int[] temp : scale) {
                if(temp[0] < end && start < temp[1]) {
                    return false;
                }
            }
            scale.add(new int[] {start, end});
            return true;
        }
    }
}
