package leetcode.oo.tree;

public final class LowestCommonAncestor {

    private PlainTree lowest;

    public PlainTree lowestCommonAncestor(PlainTree root, PlainTree p, PlainTree q) {
        this.dfs(root, p, q);
        return this.lowest;
    }

    private boolean dfs(final PlainTree root, final PlainTree p, final PlainTree q) {
        if (root == null) {
            return false;
        }
        final boolean current = root == p || root == q;
        final boolean left = this.dfs(root.left, p, q);
        final boolean right = this.dfs(root.right, p, q);
        if (left && right || current && left || current && right) {
            this.lowest = root;
        }
        return left|| right|| current;
    }

}
