import java.util.LinkedList;
import java.util.Queue;

public class No104 {
    public class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    public int maxXDepth2(TreeNode root) {
        int count = 0;
        if(root == null) return count;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;

    }
}
