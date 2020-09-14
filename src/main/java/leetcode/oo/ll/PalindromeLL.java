package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Palindrome LinkedList.
 * See {@link <a href ="https://leetcode.com/problems/palindrome-linked-list/">https://leetcode.com/problems/palindrome-linked-list/</a>}
 */
final class PalindromeLL {

    boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode middle = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            middle = middle.next;
        }
        ListNode reversedFromMiddle = this.reverse(middle);
        while (reversedFromMiddle != null) {
            if (head.val != reversedFromMiddle.val) {
                return false;
            }
            head = head.next;
            reversedFromMiddle = reversedFromMiddle.next;
        }
        return true;
    }

    private ListNode reverse(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        final ListNode reversed = this.reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
