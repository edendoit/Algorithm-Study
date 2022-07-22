public class No965 {
    // int val = -1;
    // public boolean isUnivalTree(TreeNode root) {
    //     if(root == null) return true;
    //     if(val < 0) val = root.val;
    //     return root.val == val && isUnivalTree(root.left) && isUnivalTree(root.right);
    // }
    // https://leetcode.com/problems/univalued-binary-tree/discuss/211190/JavaC%2B%2BPython-Straight-Forward

   //public boolean isUnivalTree(TreeNode root) {
   //    Queue<TreeNode> q = new LinkedList<>();
   //    q.offer(root);
   //    while (!q.isEmpty()) {
   //        TreeNode n = q.poll();
   //        if (n.val != root.val) { return false; }
   //        if (n.left != null) { q.offer(n.left); }
   //        if (n.right != null) { q.offer(n.right); }
   //    }
   //    return true;
   //}
}

// https://leetcode.com/problems/univalued-binary-tree/discuss/211397/JavaPython-3-BFS-and-DFS-clean-codes-w-brief-analysis.