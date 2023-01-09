package leetcode.oo.tree;

//https://leetcode.com/problems/distribute-coins-in-binary-tree/
final class DistributeCoins {

    private int cnt;

    int distributeCoins(final PlainTree root) {
        this.postOrder(root);
        return this.cnt;
    }

    private int postOrder(final PlainTree node) {
        if (node != null) {
            int prevCoins = this.postOrder(node.left) + this.postOrder(node.right);
            if (node.val == 0) {
                prevCoins -= 1;
            } else {
                prevCoins += node.val-1;
            }
            this.cnt += Math.abs(prevCoins);
            return prevCoins;
        }
        return 0;
    }

}
