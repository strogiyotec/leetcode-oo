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
        final int root = this.getRoot(n, leftChild, rightChild);
        if (root == -1) {
            return false;
        }
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        final Set<Integer> visited = new HashSet<>(n << 1);
        while (!queue.isEmpty()) {
            final Integer current = queue.poll();
            if (!visited.add(current)) {
                return false;
            }
            if (rightChild[current] != -1) {
                queue.add(rightChild[current]);
            }
            if (leftChild[current] != -1) {
                queue.add(leftChild[current]);
            }
        }
        return visited.size() == n;
    }

    private int getRoot(final int n, final int[] leftChild, final int[] rightChild) {
        final Set<Integer> sequence = IntStream.range(0, n).boxed().collect(Collectors.toSet());
        for (final int i : rightChild) {
            sequence.remove(i);
        }
        for (final int i : leftChild) {
            sequence.remove(i);
        }
        if (sequence.size() != 1) {
            return -1;
        }
        return sequence.iterator().next();
    }

}
