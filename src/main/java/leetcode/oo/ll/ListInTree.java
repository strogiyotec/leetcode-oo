package leetcode.oo.ll;

import leetcode.oo.ListNode;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/linked-list-in-binary-tree/
public final class ListInTree {

    public boolean isSubPath(final ListNode head, PlainTree root) {
        return this.postOrder(head, root);
    }

    private boolean postOrder(final ListNode head, PlainTree root) {
        if (root != null) {
            if (root.val == head.val) {
                if (this.dfs(head, root)) {
                    return true;
                }
            }
            return this.postOrder(head, root.left) || this.postOrder(head, root.right);
        }
        return false;
    }

    private boolean dfs(final ListNode head, final PlainTree root) {
        if (head == null) {
            return true;
        }
        if (root == null || root.val != head.val) {
            return false;
        }
        return this.dfs(head.next, root.left) || this.dfs(head.next, root.right);
    }
}
