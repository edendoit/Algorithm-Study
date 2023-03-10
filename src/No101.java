import javax.swing.tree.TreeNode;
import java.util.Queue;

public class No101 {
//    public boolean isSymmetric(TreeNode root) {
//        if(root==null) return true;
//        return isMirror(root.left,root.right);
//    }
//
//    public boolean isMirror(TreeNode p, TreeNode q) {
//        if(p==null && q==null) return true;
//        if(p==null || q==null) return false;
//        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
//    }

    // BFS
//    public boolean isSymmetric2(TreeNode root) {
//        if (root == null) return true;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root.left);
//        queue.offer(root.right);
//
//        while(queue.size() >0) {
//            TreeNode t1 = queue.poll();
//            TreeNode t2 = queue.poll();
//
//            if(t1 == null && t2 == null) continue;
//            if(t1 == null || t2 == null) return false;
//            if(t1.val != t2.val) return false;
//
//            queue.offer(t1.left);
//            queue.offer(t2.right);
//
//            queue.offer(t1.right);
//            queue.offer(t2.left);
//        }
//        return true;
//    }
    // https://leetcode.com/problems/symmetric-tree/solutions/433170/ismirror-dfs-recursion-one-two-stacks-bfs-queue-solution-in-java/
}
