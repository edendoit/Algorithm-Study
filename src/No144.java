public class No144 {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        LinkedList<Integer> ans = new LinkedList();
//        Stack<TreeNode> stack = new Stack();
//        if(root == null) return ans;
//
//        stack.push(root);
//        while(!stack.isEmpty()) {
//            TreeNode cur = stack.pop();
//            ans.add(cur.val);
//            if(cur.right != null) stack.push(cur.right);
//            if(cur.left != null) stack.push(cur.left);
//        }
//        return ans;
//    }
}
// https://leetcode.com/problems/binary-tree-preorder-traversal/discuss/45468/3-Different-Solutions