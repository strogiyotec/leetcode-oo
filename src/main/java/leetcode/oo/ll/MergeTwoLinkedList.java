package leetcode.oo.ll;

import leetcode.oo.ListNode;

/**
 * Merge Two Sorted Lists.
 * See {@link <a href ="https://leetcode.com/problems/merge-two-sorted-lists/">https://leetcode.com/problems/merge-two-sorted-lists/</a>}
 */
final class MergeTwoLinkedList {

    ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode current = null;
        ListNode answer = null;
        while (first != null || second != null) {
            //still some elements in both lists
            if (first != null && second != null) {
                final int firstVal = first.val;
                final int secondVal = second.val;
                if (firstVal <= secondVal) {
                    //first iteration
                    if (answer == null) {
                        answer = new ListNode(firstVal);
                        current = answer;
                    } else {
                        current.next = new ListNode(firstVal);
                        current = current.next;
                    }
                    first = first.next;
                } else{
                    //first iteration
                    if (answer == null) {
                        answer = new ListNode(secondVal);
                        current = answer;
                    } else {
                        current.next = new ListNode(secondVal);
                        current = current.next;
                    }
                    second = second.next;
                }
            }  else if(first != null){
                //first iteration
                if (answer == null) {
                    answer = new ListNode(first.val);
                    current = answer;
                } else {
                    current.next = new ListNode(first.val);
                    current = current.next;
                }
                first = first.next;
            } else{
                if (answer == null) {
                    answer = new ListNode(second.val);
                    current = answer;
                } else {
                    current.next = new ListNode(second.val);
                    current = current.next;
                }
                second = second.next;
            }
        }
        return answer;
    }
}
