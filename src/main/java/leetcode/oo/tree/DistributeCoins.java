package leetcode.oo.tree;

//https://leetcode.com/problems/distribute-coins-in-binary-tree/
final class DistributeCoins {

    int distributeCoins(final PlainTree root) {
        final int[] cnt = new int[1];
        this.postOrder(root, cnt);
        return cnt[0];
    }

    private int postOrder(final PlainTree root, final int[] cnt) {
        if (root == null) {
            return 0;
        }
        final int left = this.postOrder(root.left, cnt);
        final int right = this.postOrder(root.right, cnt);
        cnt[0] += Math.abs(left) + Math.abs(right);
        return root.val + left + right - 1;
    }
}
