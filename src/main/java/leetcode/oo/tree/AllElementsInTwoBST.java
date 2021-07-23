package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public final class AllElementsInTwoBST {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(2);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(4);
        final PlainTree tree2 = new PlainTree(1);
        tree2.left = new PlainTree(0);
        tree2.right = new PlainTree(3);
        System.out.println(new AllElementsInTwoBST().getAllElements(
            tree,
            tree2
        ));
    }

    public List<Integer> getAllElements(final PlainTree root1, final PlainTree root2) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        this.inOrder(queue, root1);
        this.inOrder(queue, root2);
        final List<Integer> list = new ArrayList<>(queue.size());
        while(!queue.isEmpty()){
            list.add(queue.poll());
        }
        return list;
    }

    private void inOrder(final PriorityQueue<Integer> storage, final PlainTree node) {
        if (node != null) {
            this.inOrder(storage, node.left);
            storage.add(node.val);
            this.inOrder(storage, node.right);
        }
    }
}
