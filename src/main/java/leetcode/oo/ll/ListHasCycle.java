package leetcode.oo.ll;

import java.util.IdentityHashMap;
import leetcode.oo.ListNode;

//https://leetcode.com/problems/linked-list-cycle/
final class ListHasCycle {

    boolean hasCycle(ListNode head) {
        final IdentityHashMap<ListNode, Boolean> map = new IdentityHashMap<>();
        ListNode next = head;
        while (next != null) {
            if (map.containsKey(next)) {
                return true;
            }
            map.put(next, true);
            next = next.next;

        }
        return false;
    }
}
