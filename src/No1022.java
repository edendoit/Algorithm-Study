public class No1022 {
//
//    public int SumRootToLeaf(TreeNode root) {
//        return dfs(root, 0);
//    }
//
//    public int dfs(TreeNode root, int val) {
//        if(root == null) return 0;
//        val = val*2 + root.val;
//        return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right , val);
//    }
}

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/discuss/270025/JavaC%2B%2BPython-Recursive-Solution