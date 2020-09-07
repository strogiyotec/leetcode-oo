package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Sort linked list.
 * See {@link <a href ="https://leetcode.com/problems/sort-list/">https://leetcode.com/problems/sort-list/</a>}
 */
final class SortList {

    ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = head;
        ListNode prev = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = middle;
            middle = middle.next;
            fast = fast.next.next;
        }
        prev.next = null;
        head = this.sortList(head);
        middle = this.sortList(middle);
        return merge(head, middle);
    }

    private ListNode merge(ListNode head, ListNode middle) {
        final ListNode sorted = new ListNode(-1);
        ListNode temp = sorted;
        while (head != null && middle != null) {
            if (head.val < middle.val) {
                temp.next = head;
                temp = temp.next;
                head = head.next;
            } else {
                temp.next = middle;
                temp = temp.next;
                middle = middle.next;
            }
        }
        while (head != null) {
            temp.next = head;
            temp = temp.next;
            head = head.next;
        }
        while (middle != null) {
            temp.next = middle;
            temp = temp.next;
            middle = middle.next;
        }
        return sorted.next;
    }


}
