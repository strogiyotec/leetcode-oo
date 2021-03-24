package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
final class GoodNodes {

    int goodNodes(final PlainTree root) {
        final AtomicInteger cnt = new AtomicInteger(0);
        this.postOrder(root.val, cnt, root);
        return cnt.get();
    }

    public void postOrder(final int maxValue, final AtomicInteger cnt, final PlainTree root) {
        if (root == null) {
            return;
        }
        if (root.val >= maxValue) {
            cnt.incrementAndGet();
        }
        this.postOrder(Math.max(maxValue, root.val), cnt, root.left);
        this.postOrder(Math.max(maxValue, root.val), cnt, root.right);
    }
}
