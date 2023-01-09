package leetcode.oo.tree;

public final class LowestCommonAncestor {

    private PlainTree lowest;

    public PlainTree lowestCommonAncestor(PlainTree root, PlainTree p, PlainTree q) {
        this.lowest(root, p, q);
        return this.lowest;
    }

    private boolean lowest(final PlainTree root, final PlainTree p, final PlainTree q) {
        if (root != null) {
            final boolean current = root == p || root == q;
            final boolean left = this.lowest(root.left, p, q);
            final boolean right = this.lowest(root.right, p, q);
            if (left && right || left && current || right && current) {
                this.lowest = root;
            }
            return current || left || right;
        }
        return false;
    }

}
