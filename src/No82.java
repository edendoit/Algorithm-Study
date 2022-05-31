public class No82 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {

        // No83 Reference
//        public ListNode deleteDuplicates(ListNode head) {
//            if(head == null || head.next == null) {
//                return head;
//            }
//            head.next = deleteDuplicates(head.next);
//            if(head.val == head.next.val)
//                return head.next;
//            else
//                return head;
//        }

        // No82
//        public ListNode deleteDuplicates(ListNode head) {
//            ListNode dummy = new ListNode(0), fast = head, slow = dummy;
//            slow.next = fast;
//
//            while(fast != null) {
//                while(fast.next != null && fast.val == fast.next.val) {
//                    fast = fast.next;
//                }
//                if(slow.next != fast) {
//                    slow.next = fast.next;
//                    fast = slow.next;
//                } else {
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//            }
//            return dummy.next;
//        }
    }
}
