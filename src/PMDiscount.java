// https://school.programmers.co.kr/learn/courses/30/lessons/131127
// 프로그래머스: 할인 행사
import java.util.*;
import java.io.*;
class PMDiscount {
    static
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        // make shopping list
        for(int i=0; i<number.length; i++) {
            map.put(want[i], number[i]);
        }

        Map<String, Integer> buy = new HashMap<>();
        int cnt, day;
        boolean compare;
        for(int i=0; i<discount.length; i++) {
            buy = new HashMap<String, Integer>();
            buy.putAll(map);
            cnt=0; day=10; compare=false;
            System.out.println(i+"=====================");
            for(int j=i; j<discount.length; j++) {
                if(day==0) break;
                if(buy.containsKey(discount[j])) { // buy에 discount[j]가 존재하면
                    if(buy.get(discount[j])>0) { // value값이 0보다 클때
                        buy.put(discount[j], buy.get(discount[j])-1); // value 값-1
                        if(buy.get(discount[j])==0) { // 살 거 다 샀을 때
                            System.out.println(j+"번쨰===>"+discount[j]);
                            cnt++; // number중 하나 산 것 추가
                            compare=true;
                        }
                    }
                }
                if(cnt==number.length && compare) {answer++;
                    System.out.println("이때 플함");
                    break;
                    } //
                day--;
            }

            System.out.println("=====================");

        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String[] want={"banana", "apple", "rice", "pork", "pot"};
        int[] number={3, 2, 2, 2, 1};
        String[] discnt = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        solution(want, number, discnt);

        int[][] arr = {{1, 4}, {3, 2}, {4, 1}};
        System.out.println(arr.length+"   |   "+arr[0].length);

    }
}