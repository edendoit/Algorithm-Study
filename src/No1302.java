import java.util.LinkedList;
import java.util.Queue;

public class No1302 {
    public int deepestLeavesSum(TreeNode root) {
        int res = 0, i;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            for(i = queue.size()-1, res=0; i>=0; i--) {
                TreeNode cur = queue.poll();
                res += cur.val;
                if (cur.right != null) queue.add(cur.right);
                if (cur.left != null) queue.add(cur.left);
            }
        }
        return res;
    }
}// https://leetcode.com/problems/deepest-leaves-sum/solutions/463239/java-c-python-level-traversal/
