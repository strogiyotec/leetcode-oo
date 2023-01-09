package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/split-linked-list-in-parts/
final class SplitLinkedList {

    ListNode[] splitListToParts(final ListNode root, final int parts) {
        int size = 0;
        for (ListNode temp = root; temp != null; temp = temp.next) {
            size++;
        }
        int biggerParts = size % parts;
        int partsSize = size / parts -1;
        int index = 0;
        final ListNode[] splitted = new ListNode[parts];
        ListNode head = root;
        while (head != null) {
            ListNode tail = head;
            final int addOne = biggerParts > 0 ? 1 : 0;
            for (int i = 0; i < partsSize + addOne && tail != null; i++) {
                tail = tail.next;
            }
            if (tail != null) {
                final ListNode nextHead = tail.next;
                tail.next = null;
                splitted[index++] = head;
                head = nextHead;
                biggerParts--;
            }
        }
        return splitted;
    }
}
