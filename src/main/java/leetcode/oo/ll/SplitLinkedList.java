package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/split-linked-list-in-parts/
final class SplitLinkedList {

    ListNode[] splitListToParts(ListNode root, final int parts) {
        final int size = this.getSize(root);
        int biggerParts = size % parts;
        final int sizePerPart = size / parts - 1;
        final ListNode[] solution = new ListNode[parts];
        for (int i = 0; i < parts; i++) {
            ListNode temp = root;
            for (int j = 0; j < (biggerParts == 0 ? sizePerPart : sizePerPart + 1) && root != null; j++) {
                root = root.next;
            }
            biggerParts = Math.max(0, biggerParts - 1);
            if (root != null) {
                final ListNode next = root.next;
                root.next = null;
                root = next;
            }
            solution[i] = temp;
        }
        return solution;
    }

    private int getSize(final ListNode root) {
        int size = 0;
        for (ListNode temp = root; temp != null; temp = temp.next) {
            size++;
        }
        return size;
    }
}
