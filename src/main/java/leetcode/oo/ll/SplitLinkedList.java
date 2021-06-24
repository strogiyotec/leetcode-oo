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
        int remainders = size % parts;
        final int sizePerNode = size / parts;
        int index = 0;
        ListNode temp = root;
        while (temp != null) {
            ListNode before = temp;
            boolean hasRemainder = remainders >= 1;
            for (int i = 0; i < sizePerNode + (hasRemainder ? 1 : 0) - 1; i++) {
                temp = temp.next;
            }
            final ListNode next = temp.next;
            temp.next = null;
            solution[index] = before;
            temp = next;
            remainders--;
            index++;
        }
        return solution;

    }
}
