import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No1087 {
    public String[] expand(String s) {
        List<String> res = new ArrayList<>();
        helper(s, 0, new StringBuilder(), res);

        String[] out = new String[res.size()];
        for(int i=0; i<res.size(); i++) out[i] = res.get(i);

        return out;

    }
    void helper(String s, int i, StringBuilder sb, List<String> res) {
        // index가 끝일 때, 마지막 sb까지 추가해주고 반환
        if(i == s.length()) {
            if(sb.length()>0) res.add(sb.toString());
            return;
        }

        char c = s.charAt(i); // c는 s의 인덱스일때,
        int pos = sb.length(); // pos는 sb 길이
        if(c=='{') {
            List<Character> list = new ArrayList<>();
            int end = i+1;

            // end는 집합이 이어질 때, 리스트에 문자 추가
            while(end < s.length() && s.charAt(end)!='}') {
                if(Character.isLetter(s.charAt(end))) list.add(s.charAt(end));
                end++;
            }

            Collections.sort(list);
            // 리스트를 StringBuilder에 쌓고 다음 집합 인덱스 end+1을 넣어줌, sb길이는 초기화
            for(char d : list) {
                sb.append(d);
                helper(s, end+1, sb, res);
                sb.setLength(pos);
            }
        }// 문자가 문자일때(배열 시작 안할 때) 그냥 StringBuilder에 쌓고 인덱스 i+1
        else if(Character.isLetter(c)) {
            sb.append(s.charAt(i));
            helper(s, i+1, sb, res);
        }
    }
}
//https://leetcode.com/problems/brace-expansion/solutions/622123/java-backtracking-solution-0ms/?envType=study-plan-v2&envId=premium-algo-100