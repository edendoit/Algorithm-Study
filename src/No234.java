public class No234 {
//    public boolean isPalindrome(ListNode head) {
//List<Integer> vals = new ArrayList<>();
//    ListNode cur = head;
//        while (cur != null) {
//        vals.add(cur.val);
//        cur = cur.next;
//    }
//
//    int start = 0, end = vals.size()-1;
//        while(start < end) {
//        if(!vals.get(start).equals(vals.get(end))) {
//            return false;
//        }
//        start ++;
//        end --;
//
//    }
//        return true;

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

//    public boolean isPalindrome(ListNode head) {
//        ListNode fast = head, slow = head;
//        while(fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        if(fast != null) {
//            slow = slow.next;
//        }
//        slow = reverse(slow);
//        fast = head;
//
//        while(slow != null) {
//            if(fast.val != slow.val) {
//                return false;
//            } fast = fast.next;
//            slow = slow.next;
//        }
//        return true;
//    }
//
//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        while(head != null) {
//            ListNode next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        } return prev;
//    }
    // https://leetcode.com/problems/palindrome-linked-list/solutions/64501/java-easy-to-understand/?envType=study-plan&id=level-2&orderBy=most_votes
}
