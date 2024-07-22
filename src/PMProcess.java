import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PMProcess {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            qu.offer(new int[]{priorities[i], i});
        }

        while(!qu.isEmpty()) {
            int[] cur = qu.poll();
            boolean flag = false;

            for(int[] process : qu) {
                if(cur[0]<process[0]) {
                    flag=true;
                    break;
                }
            }

            if(flag) {
                qu.offer(cur);
            } else {
                answer++;
                if(cur[1]==location) {
                    return answer;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pri = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loc = Integer.parseInt(st.nextToken());

    }
}
