package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
public final class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.left = new PlainTree(15);
        tree.right.right = new PlainTree(7);
        final BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(traversal.levelOrderBottom(tree));
    }

    public List<List<Integer>> levelOrderBottom(PlainTree root) {
        final Stack<List<PlainTree>> stack = new Stack<>();
        stack.push(Collections.singletonList(root));
        while (true) {
            final List<PlainTree> peek = stack.peek();
            final List<PlainTree> next = new ArrayList<>(peek.size());
            for (final PlainTree child : peek) {
                if (child.left != null) {
                    next.add(child.left);
                }
                if (child.right != null) {
                    next.add(child.right);
                }
            }
            if (!next.isEmpty()) {
                stack.push(next);
            } else {
                break;
            }
        }
        final List<List<Integer>> solution = new ArrayList<>(stack.size());
        while (!stack.isEmpty()) {
            final List<PlainTree> pop = stack.pop();
            solution.add(
                pop.stream().map(v -> v.val).collect(Collectors.toList())
            );
        }
        return solution;
    }
}
