public class No234 {
//    public boolean isPalindrome(ListNode head) {
//        ListNode reverseHead = reverseList(head);
//
//        ListNode p1 = head;
//        ListNode p2 = reverseHead;
//
//        while(head != null) {
//            if(head.val != reverseHead.val)  return false;
//
//            head = head.next;
//            reverseHead = reverseHead.next;
//        }
//
//        return true;
//    }
//
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode dummy = new ListNode(0);
//        dummy.next = null;
//
//        while(head != null) {
//            ListNode newNode = new ListNode(head.val);
//            newNode.next = dummy.next;
//            dummy.next = newNode;
//            head = head.next;
//        }
//        return dummy.next;
//
//
//    }
}
