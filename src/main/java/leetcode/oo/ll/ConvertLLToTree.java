package leetcode.oo.ll;

import leetcode.oo.ListNode;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
final class ConvertLLToTree {

    PlainTree sortedListToBST(final ListNode head) {
        return this.toTree(head, null);
    }

    private PlainTree toTree(final ListNode head, final ListNode right) {
        if (head == right) {
            return null;
        }
        ListNode middle = head;
        ListNode fast = head;
        while (fast != right && fast.next != right) {
            middle = middle.next;
            fast = fast.next.next;
        }
        final PlainTree tree = new PlainTree(middle.val);
        tree.left = this.toTree(head, middle);
        tree.right = this.toTree(middle.next, right);
        return tree;
    }
}
