package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Merge Two Sorted Lists.
 * See {@link <a href ="https://leetcode.com/problems/merge-two-sorted-lists/">https://leetcode.com/problems/merge-two-sorted-lists/</a>}
 */
final class MergeTwoLinkedList {
    static void main(String[] args) {
        System.out.println(new MergeTwoLinkedList().mergeTwoLists(
                new ListNode(1).withNext(2).withNext(4),
                new ListNode(1).withNext(3).withNext(4)
        ));
    }

    ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode node;
        ListNode answer;
        if ((first != null && second != null && first.val < second.val) || (first != null && second == null)) {
            node = new ListNode(first.val);
            answer = node;
            first = first.next;
        } else {
            node = new ListNode(second.val);
            answer = node;
            second = second.next;
        }
        while (first != null || second != null) {
            if (first != null && second != null) {
                final int leftV = first.val;
                final int rightV = second.val;
                if (leftV <= rightV) {
                    node.next = new ListNode(leftV);
                    first = first.next;
                } else {
                    node.next = new ListNode(rightV);
                    second = second.next;
                }
            } else if (first != null) {
                node.next = new ListNode(first.val);
                first = first.next;
            } else {
                node.next = new ListNode(second.val);
                second = second.next;
            }
            node = node.next;
        }
        return answer;
    }
}
