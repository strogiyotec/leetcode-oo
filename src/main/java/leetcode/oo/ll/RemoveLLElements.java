package leetcode.oo.ll;

import leetcode.oo.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/
final class RemoveLLElements {

    static void main(String[] args) {
        System.out.println(
            new RemoveLLElements().removeElements(
                new ListNode(1).withNext(2).withNext(6).withNext(3).withNext(4).withNext(5).withNext(6),
                6
            )
        );
        System.out.println(
            new RemoveLLElements().removeElements(
                new ListNode(1).withNext(2).withNext(2).withNext(1),
                2
            )
        );
        System.out.println(
            new RemoveLLElements().removeElements(
                new ListNode(7).withNext(7).withNext(7).withNext(7),
                7
            )
        );
    }

    public ListNode removeElements(ListNode head, final int val) {
        final ListNode temp = new ListNode(-1);
        ListNode headFollower = temp;
        while (head != null) {
            if (head.val != val) {
                headFollower.next = head;
                headFollower = headFollower.next;
            }
            head = head.next;
        }
        if (headFollower.next != null && headFollower.next.val == val) {
            headFollower.next = null;
        }
        return temp.next;
    }
}
