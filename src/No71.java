import java.util.Stack;

public class No71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] comp = path.split("/");

        // stack 에 경로 넣기
        for(String dir : comp) {
            if(dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(dir);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String dir : stack) {
            sb.append("/");
            sb.append(dir);
        }
        return sb.length()>0 ? sb.toString() : "/";
    }
    // https://leetcode.com/problems/simplify-path/editorial/
}
