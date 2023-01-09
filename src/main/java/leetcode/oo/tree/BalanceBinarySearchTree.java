package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/balance-a-binary-search-tree/
public final class BalanceBinarySearchTree {

    public PlainTree balanceBST(final PlainTree root) {
        final List<PlainTree> inOrder = new ArrayList<>(16);
        this.inOrder(inOrder, root);
        return this.balance(inOrder, 0, inOrder.size() - 1);
    }

    private PlainTree balance(final List<PlainTree> inOrder, final int left, final int right) {
        if (left > right) {
            return null;
        }
        int middle = (right + left) / 2;
        final PlainTree plainTree = inOrder.get(middle);
        plainTree.right = this.balance(inOrder, middle + 1, right);
        plainTree.left = this.balance(inOrder, left, middle - 1);
        return plainTree;
    }

    private void inOrder(final List<PlainTree> inOrder, final PlainTree root) {
        if (root != null) {
            this.inOrder(inOrder, root.left);
            inOrder.add(root);
            this.inOrder(inOrder, root.right);
        }
    }

}
