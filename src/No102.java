import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No102 {
   //public List<List<Integer>> levelOrder(TreeNode root) {
   //    List<List<Integer>> result = new ArrayList<>();
   //    if(root == null) { return result;}

   //    Queue<TreeNode> q = new LinkedList<>();
   //    q.offer(root);

   //    while(!q.isEmpty()) {
   //        int size = q.size();
   //        List<Integer> level = new ArrayList<>();

   //        for(int i=0; i<size; i++) {
   //            TreeNode curr = q.poll();
   //            level.add(curr.val);

   //            if(curr.left != null) {
   //                q.add(curr.left);
   //            }
   //            if(curr.right != null) {
   //                q.add(curr.right);
   //            }
   //        } result.add(level);
   //    }
   //    return  result;
   //}
}
// https://www.youtube.com/watch?v=sFDNL6r5aDM


//    List<List<Integer>> levels = new ArrayList<List<Integer>>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if(root == null) return levels;
//
//        getLevel(root, 0);
//        return levels;
//
//    }
//
//    public void getLevel(TreeNode root, int level) {
//        if(levels.size() == level) {
//            levels.add(new ArrayList<Integer>());
//
//        }
//
//        levels.get(level).add(root.val);
//
//        if(root.left != null) {
//            getLevel(root.left, level+1);
//        }
//        if(root.right != null) {
//            getLevel(root.right, level+1);
//        }
//
//    }