package leetcode.oo.tree;

public final class LowestCommonAncestor {

    public PlainTree lowestCommonAncestor(PlainTree root, PlainTree p, PlainTree q) {
        return this.lowest(root, p, q);
    }

    private PlainTree lowest(final PlainTree root, final PlainTree p, final PlainTree q) {
        if (p.val > root.val && q.val > root.val) {
            return this.lowest(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            return this.lowest(root.left, p, q);
        } else {
            return root;
        }
    }
}
