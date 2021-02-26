package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicReference;

//https://leetcode.com/problems/smallest-string-starting-from-leaf/
final class SmallestStringFromLeaf {

    String smallestFromLeaf(final PlainTree root) {
        final AtomicReference<String> smallest = new AtomicReference<>();
        this.toLeaf(root, smallest, new StringBuilder());
        return smallest.get();
    }

    private void toLeaf(final PlainTree root, final AtomicReference<String> smallest, final StringBuilder builder) {
        if (root != null) {
            builder.insert(0, (char) ((int) 'a' + root.val));
            if (root.left == null && root.right == null) {
                if (smallest.get() == null) {
                    smallest.set(builder.toString());
                } else {
                    if (builder.toString().compareTo(smallest.get()) < 0) {
                        smallest.set(builder.toString());
                    }
                }
                builder.deleteCharAt(0);
                return;
            }
            if (root.left != null) {
                this.toLeaf(root.left, smallest, builder);
            }
            if (root.right != null) {
                this.toLeaf(root.right, smallest, builder);
            }
            builder.deleteCharAt(0);
        }
    }
}
