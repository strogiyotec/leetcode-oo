package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
final class SerializeAndDeser {

    // Encodes a tree to a single string.
    String serialize(PlainTree root) {
        if (root == null) {
            return null;
        }
        final StringBuilder builder = new StringBuilder();
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Boolean hasMoreElements = null;
            final StringBuilder temp = new StringBuilder();
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree poll = queue.poll();
                if (poll != null) {
                    hasMoreElements = true;
                    if (builder.length() == 0) {
                        temp.append(poll.val);
                    } else {
                        temp.append(',').append(poll.val);
                    }
                    queue.offer(poll.left);
                    queue.offer(poll.right);
                } else {
                    if (hasMoreElements == null) {
                        hasMoreElements = false;
                    }
                    temp.append(",null");
                }
            }
            if (hasMoreElements) {
                builder.append(temp);
            }
        }
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public PlainTree deserialize(String data) {
        if (data == null) {
            return null;
        }
        final String[] split = data.split(",");
        final PlainTree root = new PlainTree(Integer.parseInt(split[0]));
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < split.length) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree poll = queue.poll();
                final String left = split[index++];
                if (!"null".equals(left)) {
                    poll.left = new PlainTree(Integer.parseInt(left));
                    queue.add(poll.left);
                }
                final String right = split[index++];
                if (!"null".equals(right)) {
                    poll.right = new PlainTree(Integer.parseInt(right));
                    queue.add(poll.right);
                }
            }
        }
        return root;
    }
}
