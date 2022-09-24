public class No1367 {
//    boolean checkPath(ListNode head, TreeNode root) {
//        if(head == null) return true;
//        if(root == null || root.val != head.val) return false;
//
//        if(checkPath(head.next, root.right)) return true;
//        if(checkPath(head.next, root.left)) return true;
//
//        return false;
//    }
//
//    boolean preOrder(ListNode head, TreeNode root) {
//        if(root == null) return false;
//        if(checkPath(head, root)) return true;
//
//        if(preOrder(head, root.left)) return true;
//        if(preOrder(head, root.right)) return true;
//
//        return false;
//    }
//    public boolean isSubPath(ListNode head, TreeNode root) {
//
//        return preOrder(head, root);
//    }
}

// https://www.youtube.com/watch?v=Auh37w85fA0