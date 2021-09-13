package leetcode.oo.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/validate-binary-tree-nodes/
final class ValidateTreeNodes {

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = this.findRoot(n, leftChild, rightChild);
        if (root == -1) {
            return false;
        }
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        final Set<Integer> cache = new HashSet<>(n);
        while (!queue.isEmpty()) {
            final Integer node = queue.poll();
            if (cache.contains(node)) {
                return false;
            }
            cache.add(node);
            if (leftChild[node] != -1) {
                queue.offer(leftChild[node]);
            }
            if (rightChild[node] != -1) {
                queue.offer(rightChild[node]);
            }
        }
        return cache.size() == n;
    }

    private int findRoot(final int amount, final int[] leftChild, final int[] rightChild) {
        final Set<Integer> roots = IntStream.range(0, amount).boxed().collect(Collectors.toSet());
        for (final int number : leftChild) {
            roots.remove(number);
        }
        for (final int number : rightChild) {
            roots.remove(number);
        }
        if (roots.size() == 1) {
            return roots.iterator().next();
        } else {
            return -1;
        }
    }
}
