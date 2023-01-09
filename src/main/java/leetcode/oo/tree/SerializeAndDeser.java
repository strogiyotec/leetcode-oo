package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
final class SerializeAndDeser {

    // Encodes a tree to a single string.
    String serialize(PlainTree root) {
        if (root == null) {
            return null;
        }
        final StringBuilder builder = new StringBuilder(16);
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            final StringBuilder temp = new StringBuilder(16);
            boolean anyAdded = false;
            for (int i = 0; i < size; i++) {
                final PlainTree current = queue.poll();
                if (builder.length() == 0) {
                    builder.append(current.val);
                }
                if (current.left != null) {
                    temp.append(',').append(current.left.val);
                    queue.add(current.left);
                    anyAdded = true;
                } else {
                    temp.append(",null");
                }
                if (current.right != null) {
                    temp.append(',').append(current.right.val);
                    queue.add(current.right);
                    anyAdded = true;
                } else {
                    temp.append(",null");
                }
            }
            if (anyAdded) {
                builder.append(temp);
            }
        }
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public PlainTree deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        final String[] parts = data.split(",");
        final PlainTree root = new PlainTree(Integer.parseInt(parts[0]));
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < parts.length) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree current = queue.poll();
                final String left = parts[index];
                if (!"null".equals(left)) {
                    current.left = new PlainTree(Integer.parseInt(left));
                    queue.add(current.left);
                }
                if (index + 1 < parts.length) {
                    final String right = parts[index + 1];
                    if (!"null".equals(right)) {
                        current.right = new PlainTree(Integer.parseInt(right));
                        queue.add(current.right);
                    }
                }
                index += 2;
            }
        }
        return root;
    }
}
