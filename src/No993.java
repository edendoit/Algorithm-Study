public class No993 {
    int recordDepth = -1;
    boolean isCousin = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, x, y);
        return this.isCousin;
    }

    public boolean dfs(TreeNode root, int depth, int x, int y) {
        if(root == null) return false;
        if(this.recordDepth != -1 && depth > this.recordDepth) return false;

        if(root.val == x || root.val == y) {
            if(this.recordDepth == -1) {
                this.recordDepth = depth;
            }
            return this.recordDepth == depth;
        }

        boolean left = dfs(root.left, depth+1, x, y);
        boolean right = dfs(root.right, depth+1, x, y);

        //  this.recordDepth != depth+1 : 자식노드가 아니라는 뜻 (=형제)
        if(left && right && this.recordDepth != depth+1) {
            this.isCousin = true;
        }
        return left || right;
    }
}
