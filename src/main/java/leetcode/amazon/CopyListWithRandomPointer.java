package leetcode.amazon;

import java.util.IdentityHashMap;

//https://leetcode.com/problems/copy-list-with-random-pointer/
public final class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        final IdentityHashMap<Node, Node> nodes = new IdentityHashMap<>();
        Node temp = head;
        while (temp != null) {
            nodes.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            nodes.get(temp).next = nodes.get(temp.next);
            nodes.get(temp).random = nodes.get(temp.random);
            temp = temp.next;
        }
        return nodes.get(head);
    }

    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
