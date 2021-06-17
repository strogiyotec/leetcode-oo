package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

//https://leetcode.com/problems/binary-tree-right-side-view/
public final class BinaryTreeRightView {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        System.out.println(new BinaryTreeRightView().rightSideView(tree));
    }

    public List<Integer> rightSideView(final PlainTree root) {
        if(root == null){
            return Collections.emptyList();
        }
        final List<Integer> list = new ArrayList<>();
        final Deque<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            list.add(queue.peekLast().val);
            for (int i = 0; i < size; i++) {
                final PlainTree poll = queue.poll();
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
        return list;
    }
}
