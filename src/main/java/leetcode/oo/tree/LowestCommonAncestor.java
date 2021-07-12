package leetcode.oo.tree;

public final class LowestCommonAncestor {

    private PlainTree answer;

    public PlainTree lowestCommonAncestor(PlainTree root, PlainTree p, PlainTree q) {
        this.dfs(root, p, q);
        return this.answer;
    }

    private boolean dfs(final PlainTree root, final PlainTree p, final PlainTree q) {
        if (root == null) {
            return false;
        }
        final boolean left = this.dfs(root.left, p, q);
        final boolean right = this.dfs(root.right, p, q);
        final boolean current = root == p || root == q;
        if (left && right || current && left || current && right) {
            this.answer = root;
            return true;
        }
        return left || right || current;
    }

}
