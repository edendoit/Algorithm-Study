import java.util.StringTokenizer;

public class PMJadenCase {
    public static String solution(String s) {
        String[] words = s.split(" ");
        String answer="";
        for(int i=0; i<words.length; i++) {
            String now = words[i];
            if(words[i].length() == 0) {
                answer += " ";
            } else {
                answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";
            }
        }


//        Runtime Error
//        for(int i=0; i<words.length; i++) {
//            System.out.println("0. words[i].charAt(0)-'0' = "+ (words[i].charAt(0)-'0'));
//            if(words[i].charAt(0)-'0'>=0 && words[i].charAt(0)-'0'<=9) {
//                words[i].toLowerCase();
//                System.out.println("1. words[i] = " + words[i]);
//
//            } else {
//                words[i] = words[i].toLowerCase();
//                words[i] = words[i].replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));
//                System.out.println("2. words[i] = " + words[i]);
//
//            }
//
//        }
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            return answer;
        }
        return answer.substring(0, answer.length()-1);
    }

    public static void main(String[] args) {
        solution("3people unFollowed me ");
    }
}
// https://velog.io/@yoonuk/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-JadenCase-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0Java%EC%9E%90%EB%B0%94