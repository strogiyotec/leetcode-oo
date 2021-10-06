package leetcode.oo.tree;

//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
final class DeepestNodesTree {

    private int deepestLevel;

    private PlainTree res;

    PlainTree subtreeWithAllDeepest(PlainTree root) {
        this.dfs(root, 0);
        return this.res;
    }

    private int dfs(final PlainTree root, final int depth) {
        if (root == null) {
            return depth;
        }
        final int left = this.dfs(root.left, depth + 1);
        final int right = this.dfs(root.right, depth + 1);
        if (left >= this.deepestLevel && right >= this.deepestLevel) {
            this.deepestLevel = left;
            this.res = root;
        }
        return Math.max(left,right);
    }

}
