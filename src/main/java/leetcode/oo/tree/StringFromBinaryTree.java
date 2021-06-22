package leetcode.oo.tree;

//https://leetcode.com/problems/construct-string-from-binary-tree/
final class StringFromBinaryTree {

    String tree2str(final PlainTree t) {
        final StringBuilder builder = new StringBuilder();
        this.inOrder(t, builder);
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    private void inOrder(final PlainTree tree, final StringBuilder builder) {
        if (tree != null) {
            builder.append(tree.val);
            builder.append('(');
            this.inOrder(tree.left, builder);
            if (builder.charAt(builder.length() - 1) == '(') {
                if (tree.right == null) {
                    builder.deleteCharAt(builder.length() - 1);
                } else {
                    builder.append(')');
                }
            }
            if (tree.right != null) {
                builder.append('(');
                this.inOrder(tree.right, builder);
            }
            builder.append(')');
        }
    }
}
