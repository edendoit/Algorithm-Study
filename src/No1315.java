public class No1315 {
    public int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);
        return sum;
    }

    public void dfs(TreeNode cur, TreeNode parent, TreeNode grand) {
        if(cur == null) return;
        if(grand != null && grand.val % 2 == 0) {
            sum += cur.val;
        }
        dfs(cur.left, cur, parent);
        dfs(cur.right, cur, parent);
    }
}
// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/solutions/477095/easy-dfs-solution/