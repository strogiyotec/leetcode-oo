package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/odd-even-linked-list/
final class OddEvenLL {

    ListNode oddEvenList(final ListNode head) {
        ListNode dummy = head;
        ListNode oddTail = null;
        ListNode oddHead = null;
        ListNode evenTail = null;
        ListNode evenHead = null;
        int cnt = 1;
        while (dummy != null) {
            if (cnt % 2 == 0) {
                if (evenTail == null) {
                    evenTail = new ListNode(dummy.val);
                    evenHead = evenTail;
                } else {
                    evenTail.next = new ListNode(dummy.val);
                    evenTail = evenTail.next;
                }
            } else {
                if (oddTail == null) {
                    oddTail = new ListNode(dummy.val);
                    oddHead = oddTail;
                } else {
                    oddTail.next = new ListNode(dummy.val);
                    oddTail = oddTail.next;
                }
            }
            dummy = dummy.next;
            cnt++;
        }
        oddTail.next = evenHead;
        return oddHead;
    }
}
