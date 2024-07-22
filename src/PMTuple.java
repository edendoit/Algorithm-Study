import java.util.*;
import java.io.*;
public class PMTuple {

        public static ArrayList<Integer> solution(String s) {
            ArrayList<Integer> answer = new ArrayList<>();
            s = s.replaceAll("\\{", "");
            String[] str = s.substring(0, s.length() - 2).split("\\}\\,");
            Arrays.sort(str, Comparator.comparingInt(String::length));

            for(String x : str){
                // 7. 한 문자열마다 ,를 기준으로 split하여 새로운 문자열 배열을 만든다.
                String[] temp = x.split(",");
                // 8. 새로만든 문자열 배열에는 정수값만 존재하며 이를 탐색한다.
                for(int i = 0 ; i < temp.length;i++){
                    // 9. 각 문자열 값을 정수로 바꾼다.
                    int n = Integer.parseInt(temp[i]);
                    // 10. 튜플에 들어있는 값이 아니라면 추가해준다.
                    if(!answer.contains(n))
                        answer.add(n);
                }
            }

            return answer;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }
}
