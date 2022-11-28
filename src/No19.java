// Leetcode best answer study
public class No19 {
//    ListNode start = new ListNode(0);
//    ListNode slow = start,  fast = start;
//    slow.next = head;
//
//    for(int i=0; i<=n+1; i++) {
//        fast = fast.next;
//    }
//
//    while(fast != null) {
//        slow = slow.next;
//        fast = fast.next;
//    }
//
//    slow.next = slow.next.next;
//    return start.next;



//public ListNode removeNthFromEnd(ListNode head, int n) {
//    ListNode result = head;
//    int i = 0;
//
//    while(result != null) {
//        result= result.next;
//        i++;
//    }
//
//    if(i==n) {
//        return head.next;
//    }
//
//    int realN = i - n - 1;
//    result = head;
//    for(i=0; i<realN; i++) {
//        result = result.next;
//    }
//    result.next = result.next.next;
//
//    return head;
//}
    // https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/127454/remove-nth-node-from-end-of-list/
}


