import java.util.Arrays;

public class No252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i<intervals.length-1; i++) {
            // i번째 end > i+1번째 start
            if(intervals[i][1] > intervals[i+1][0] && intervals[i][0] < intervals[i+1][1]) {
                return false;
            }

        }
        return true;
    }
}
