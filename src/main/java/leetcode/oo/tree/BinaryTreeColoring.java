package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/binary-tree-coloring-game/
final class BinaryTreeColoring {

    boolean btreeGameWinningMove(PlainTree root, int n, int x) {
        final PlainTree startPoint = this.findRoot(root, x);
        final AtomicInteger left = new AtomicInteger(0);
        final AtomicInteger right = new AtomicInteger(0);
        this.cnt(startPoint.left, left);
        this.cnt(startPoint.right, right);
        return left.get() > n / 2 || right.get() > n / 2 || left.get() + right.get() + 1 <= n / 2;
    }

    private void cnt(final PlainTree node, final AtomicInteger cnt) {
        if (node == null) {
            return;
        }
        cnt.getAndIncrement();
        this.cnt(node.left, cnt);
        this.cnt(node.right, cnt);
    }

    private PlainTree findRoot(final PlainTree root, final int value) {
        if (root == null) {
            return null;
        }
        if (root.val == value) {
            return root;
        }
        final PlainTree left = this.findRoot(root.left, value);
        if (left != null) {
            return left;
        }
        return this.findRoot(root.right, value);
    }
}
