public class No116 {
    //public Node connect(Node root) {
    //    if(root == null)
    //        return root;

    //    Node leftNode = root;
    //    while(leftNode.left != null) {
    //        Node head = leftNode;
    //        while(head != null) {
    //            head.left.next = head.right;
    //            if(head.next != null) {
    //                head.right.next = head.next.left;
    //            } head = head.next;
    //        }
    //        leftNode = leftNode.left;
    //    }
    //    return root;

    //}

//    public Node connect(Node root) {
//        if(root == null) return null;
//
//        Queue<Node> Q = new LinkedList<Node>();
//        Q.add(root);
//
//        while(Q.size() > 0) {
//            int size = Q.size();
//
//            for(int i=0; i<size; i++) {
//                Node node = Q.poll();
//                if(i<size-1) {
//                    node.next = Q.peek();
//                }
//                if(node.left != null) {
//                    Q.add(node.left);
//                }
//                if(node.right != null) {
//                    Q.add(node.right);
//                }
//            }
//        }
//        return root;
//    }
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/editorial/
}
