public class No617 {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null) return root2;
//        if(root2 == null) return root1;
//
//        TreeNode root3 = new TreeNode(root1.val + root2.val);
//
//        root3.left = mergeTrees(root1.left, root2.left);
//        root3.right = mergeTrees(root1.right, root2.right);
//
//
//        return root3;

    // solved myself
//        if(root1 == null && root2 == null) return null;
//        if(root1 == null) return root2;
//        if(root2 == null) return root1;
//
//        TreeNode res = new TreeNode(0);
//        res.val = root1.val+root2.val;
//        res.left = mergeTrees(root1.left, root2.left);
//        res.right = mergeTrees(root1.right, root2.right);
//            return res;
//    }

//    // BFS
// https://leetcode.com/problems/merge-two-binary-trees/solutions/104331/java-one-recursive-solution-and-two-iterative-solutions-dfs-and-bfs-with-explanations/
//        if(root1 == null) return root2;
//
//    Queue<TreeNode []> queue = new LinkedList<>();
//        queue.offer(new TreeNode[] {root1, root2});
//        while(!queue.isEmpty()) {
//        TreeNode[] cur = queue.poll();
//        if(cur[1] == null) {
//            continue;
//        }
//
//        cur[0].val += cur[1].val;
//        if(cur[0].left == null) {
//            cur[0].left = cur[1].left;
//        }  else {
//            queue.offer(new TreeNode[] {cur[0].left, cur[1].left});
//        }
//
//        if(cur[0].right == null) {
//            cur[0].right = cur[1].right;
//        } else {
//            queue.offer(new TreeNode[] {cur[0].right, cur[1].right});
//        }
//    }
//        return root1;
//
//}

}
