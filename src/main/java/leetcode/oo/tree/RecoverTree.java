package leetcode.oo.tree;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
final class RecoverTree {

    public PlainTree recoverFromPreorder(final String traversal) {
        final Map<Integer, PlainTree> map = new HashMap<>(traversal.length());
        int index = 0;
        while (index < traversal.length()) {
            int level = 0;
            while (index < traversal.length() && traversal.charAt(index) == '-') {
                level++;
                index++;
            }
            final StringBuilder number = new StringBuilder();
            while (index < traversal.length() && Character.isDigit(traversal.charAt(index))) {
                number.append(traversal.charAt(index));
                index++;
            }
            final PlainTree node = new PlainTree(Integer.parseInt(number.toString()));
            map.put(level, node);
            if (level != 0) {
                final PlainTree parent = map.get(level - 1);
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            }
        }
        return map.get(0);
    }
}
