package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/split-linked-list-in-parts/
final class SplitLinkedList {

    ListNode[] splitListToParts(final ListNode root, final int parts) {
        int size = 0;
        for (ListNode temp = root; temp != null; temp = temp.next) {
            size++;
        }
        int biggerSize = size % parts;
        int lengthPerPart = size / parts - 1;
        final ListNode[] nodes = new ListNode[parts];
        int index = 0;
        ListNode current = root;
        while (current != null && index < parts) {
            ListNode next = current;
            final boolean hasRemaining = biggerSize > 0;
            for (int i = 0; i < lengthPerPart + (hasRemaining ? 1 : 0); i++) {
                current = current.next;
            }
            biggerSize--;
            nodes[index] = next;
            final ListNode temp = current.next;
            current.next = null;
            current = temp;
            index++;
        }
        return nodes;
    }
}
