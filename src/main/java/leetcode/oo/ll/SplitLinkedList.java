package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/split-linked-list-in-parts/
final class SplitLinkedList {

    ListNode[] splitListToParts(final ListNode root, final int parts) {
        int size = 0;
        for (ListNode temp = root; temp != null; temp = temp.next) {
            size++;
        }
        final ListNode[] solution = new ListNode[parts];
        int biggerSize = size % parts;
        final int sizePerPart = size / parts -1;
        ListNode current = root;
        for (int i = 0; i < parts && current != null; i++) {
            ListNode next = current;
            final boolean hasRemaining = biggerSize > 0;
            for (int j = 0; j < sizePerPart + (hasRemaining ? 1 : 0); j++) {
                current = current.next;
            }
            biggerSize--;
            solution[i] = next;
            final ListNode temp = current.next;
            current.next = null;
            current = temp;
        }
        return solution;
    }
}
