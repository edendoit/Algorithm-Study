import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//public class No103 {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//        List<List<Integer>> res = new ArrayList<>();
//        if(root == null) return res;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        // queue는 root를 복사함
//        queue.add(root);
//
//        boolean zigzag = false;
//
//        while(!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<>();
//            int cnt = queue.size();
//
//            for(int i=0; i<cnt; i++) {
//                TreeNode node = queue.poll();
//                if(zigzag) {
//                    level.add(0, node.val);
//                } else {
//                    level.add(node.val);
//                }
//
//                if(node.left != null) {
//                    queue.add(node.left);
//                }
//                if(node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//
//            res.add(level);
//            zigzag = !zigzag;
//        }
//        return res;
//    }
//}
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/solutions/33815/my-accepted-java-solution/
