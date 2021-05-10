package leetcode.oo.tree;

//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
 final class DeepestNodesTree {

    private int deepestLevel;

    private PlainTree res;

     PlainTree subtreeWithAllDeepest(PlainTree root) {
        this.dfs(root, 0);
        return this.res;
    }

    private int dfs(final PlainTree root, final int level) {
        if (root == null) {
            return level;
        }
        final int left = this.dfs(root.left, level + 1);
        final int right = this.dfs(root.right, level + 1);
        final int current = Math.max(left,right);
        this.deepestLevel = Math.max(this.deepestLevel,current);
        if(this.deepestLevel == left && this.deepestLevel == right){
            this.res = root;
        }
        return current;

    }

}
