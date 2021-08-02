package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/partition-list/
public final class PartitionList {

    public static void main(String[] args) {
        System.out.println(new PartitionList().partition(
            new ListNode(1).withNext(4).withNext(3).withNext(2).withNext(5).withNext(2),
            3
        ));
    }

    public ListNode partition(final ListNode head, final int x) {
        ListNode lower = new ListNode(-1);
        ListNode bigger = new ListNode(-1);
        ListNode currentLower = lower;
        ListNode currentBigger = bigger;
        ListNode dummy = head;
        while (dummy != null) {
            if (dummy.val >= x) {
                currentBigger.next = dummy;
                currentBigger = currentBigger.next;
            } else {
                currentLower.next = dummy;
                currentLower = currentLower.next;
            }
            dummy = dummy.next;
        }
        currentBigger.next = null;
        currentLower.next = null;
        currentLower.next = bigger.next;
        return lower.next;
    }
}
