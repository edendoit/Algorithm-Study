import java.util.ArrayList;
import java.util.List;

public class No1903 {

    public static void main(String[] args) {
        //System.out.println(largestOddNumber("7542351161"));
        //int x = 10, y=5;
        //changeInt(x, y); System.out.println(x+" "+ y);
        String[] str = new String[]{"abc", "cbd", "ddd", "ddd", "dbc", "cbd"};
        System.out.println(solution(3, 	str));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt=1;
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1; i<words.length; i++) {
            // 첫 단어 그냥 넣고 두번째부터 확인, list에 있는지 확인
            if(!list.contains(words[i]) &&
                    words[i-1].charAt(words[i-1].length()-1)==(
                            words[i].charAt(0))) {
                list.add(words[i]);
                // (i+1)>n 이면 cnt++
                if((i+1)>=n && (i+1)%n==0){
                    cnt++;
                }
            } else { // 끝말잇기 틀리면
                // answer[0]= 몇번째 사람, answer[1]= 몇 회때
                if((i+1)>n) {
                    answer[0]=(i+1)%n==0 ? n : (i+1)%n;
                    System.out.println("answer[0]="+answer[0]);
                } else {
                    answer[0]=i+1;
                    System.out.println("answer[0]="+answer[0]);
                }
                answer[1]=cnt;
                System.out.println("answer[1]="+answer[1]);
                break;

            }


        }

        return answer;
    }

    public static String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--) {
            if(Character.getNumericValue(num.charAt(i))%2!=0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void changeInt(int a, int b) {
        int tmp = a;
        a = b;
        b= tmp;

    }
}
