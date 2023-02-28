import java.util.ArrayList;

public class No230 {
//    public int kthSmallest(TreeNode root, int k) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//
//        while(true) {
//            while(root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if(--k == 0) return root.val;
//            root = root.right;
//        }
//    }

//    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
//        if(root == null) return arr;
//
//        inorder(root.left, arr);
//        arr.add(root.val);
//        inorder(root.right, arr);
//        return arr;
//    }
//
//    public int kthSmallest(TreeNode root, int k) {
//        ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
//        return nums.get(k-1);
//
//    }
}
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/editorial/