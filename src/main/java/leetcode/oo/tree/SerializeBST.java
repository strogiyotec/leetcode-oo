package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/serialize-and-deserialize-bst/
final class SerializeBST {

    // Encodes a tree to a single string.
    String serialize(final PlainTree root) {
        if (root == null) {
            return null;
        }
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        final StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            final int size = queue.size();
            final StringBuilder temp = new StringBuilder();
            Boolean hasElements = null;
            for (int i = 0; i < size; i++) {
                final PlainTree poll = queue.poll();
                if (poll != null) {
                    hasElements = true;
                    temp.append(poll.val).append(' ');
                    queue.add(poll.left);
                    queue.add(poll.right);
                } else {
                    if (hasElements == null) {
                        hasElements = false;
                    }
                    temp.append("null ");
                }
            }
            if (hasElements) {
                builder.append(temp);
            }
        }
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    @SuppressWarnings("ALL")
    public PlainTree deserialize(final String data) {
        if (data == null) {
            return null;
        }
        final String[] split = data.split(" ");
        if (split.length == 0) {
            return null;
        }
        final PlainTree root = new PlainTree(Integer.parseInt(split[0]));
        int cnt = 1;
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty() && cnt < split.length) {
            final int size = queue.size();
            for (int i = 0; i < size && cnt < split.length; i++) {
                final PlainTree poll = queue.poll();
                final String left = split[cnt++];
                if (!"null".equals(left)) {
                    poll.left = new PlainTree(Integer.parseInt(left));
                    queue.add(poll.left);
                }
                final String right = split[cnt++];
                if (!"null".equals(right)) {
                    poll.right = new PlainTree(Integer.parseInt(right));
                    queue.add(poll.right);
                }
            }
        }
        return root;
    }
}
