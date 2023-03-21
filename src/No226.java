import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class No226 {
//    public TreeNode invertTree(TreeNode root) {
//
//        if(root == null) return null;
//        TreeNode curLeft = invertTree(root.left);
//        TreeNode curRight = invertTree(root.right);
//        root.left = curRight;
//        root.right = curLeft;
//
//        // TreeNode tmp = root.left;
//        // root.left = invertTree(root.right);
//        // root.right = invertTree(tmp);
//
//        return root;
//    }

    // BFS
//     if(root == null) return null;
//
//    Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//        TreeNode cur = queue.poll();
//        TreeNode temp = cur.left;
//        cur.left = cur.right;
//        cur.right = temp;
//
//        if(cur.left != null) queue.add(cur.left);
//        if(cur.right != null) queue.add(cur.right);
//
//    }
//        return root;
}
// https://leetcode.com/problems/invert-binary-tree/editorial/