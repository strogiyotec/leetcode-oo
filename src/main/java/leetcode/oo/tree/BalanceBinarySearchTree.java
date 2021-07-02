package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/balance-a-binary-search-tree/
public final class BalanceBinarySearchTree {

    public PlainTree balanceBST(final PlainTree root) {
        final List<PlainTree> inOrder = new ArrayList<>(16);
        this.inOrder(inOrder, root);
        return this.balance(0, inOrder.size() - 1, inOrder);
    }

    private PlainTree balance(final int left, final int right, final List<PlainTree> inOrder) {
        if (left > right) {
            return null;
        }
        final int middle = (right - left) / 2 + left;
        final PlainTree tree = inOrder.get(middle);
        tree.left = this.balance(left, middle - 1, inOrder);
        tree.right = this.balance(middle + 1, right, inOrder);
        return tree;
    }

    private void inOrder(final List<PlainTree> inOrder, final PlainTree root) {
        if (root != null) {
            this.inOrder(inOrder, root.left);
            inOrder.add(root);
            this.inOrder(inOrder, root.right);
        }
    }
}
