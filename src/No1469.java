import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No1469 {
    // BFS
//    public List<Integer> getLonelyNodes(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        if(root == null) return ans;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            for(int i=0; i<size; i++) {
//                TreeNode cur = queue.poll();
//                if(cur.left != null && cur.right != null) {
//                    queue.offer(cur.left);
//                    queue.offer(cur.right);
//                } else if (cur.left != null ){
//                    ans.add(cur.left.val);
//                    queue.offer(cur.left);
//                } else if (cur.right != null) {
//                    ans.add(cur.right.val);
//                    queue.offer(cur.right);
//                }
//            }
//        }
//        return ans;
//    }

    // DFS
//    public List<Integer> getLonelyNodes(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        process(root, ans);
//
//        return ans;
//    }
//
//    public void process(TreeNode root, List<Integer> ans) {
//        if(root.left == null && root.right == null) return;
//
//        if(root.left != null && root.right != null) {
//            process(node.left, ans);
//            process(node.right, ans);
//        } else if (root.left != null) {
//            ans.add(root.left.val);
//            process(root.left, ans);
//        } else if (root.right != null) {
//            ans.add(root.right.val);
//            process(root.right, ans);
//        }
//
//    }
    // https://leetcode.com/problems/find-all-the-lonely-nodes/solutions/1241519/java-solutions-bfs-and-dfs/


}
