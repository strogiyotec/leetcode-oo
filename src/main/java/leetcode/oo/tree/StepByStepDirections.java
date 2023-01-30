package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/description/
public final class StepByStepDirections {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(1);
        tree.right = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.right.left = new PlainTree(6);
        tree.right.right = new PlainTree(4);
        System.out.println(new StepByStepDirections().getDirections(
            tree,
            3, 6
        ));
    }

    public String getDirections(PlainTree root, int startValue, int destValue) {
        final List<Character> pathRootToStart = this.find(root, startValue);
        final List<Character> pathRootToDest = this.find(root, destValue);
        this.shortenPaths(pathRootToStart, pathRootToDest);
        final StringBuilder solution = new StringBuilder(pathRootToStart.size() + pathRootToDest.size());
        solution.append("U".repeat(pathRootToStart.size()));
        for (int i = pathRootToDest.size() - 1; i >= 0; i--) {
            solution.append(pathRootToDest.get(i));
        }
        return solution.toString();
    }

    private void shortenPaths(final List<Character> pathRootToStart, final List<Character> pathRootToDest) {
        while (
            this.lastElementsEqual(pathRootToStart, pathRootToDest)
        ) {
            pathRootToDest.remove(pathRootToDest.size() - 1);
            pathRootToStart.remove(pathRootToStart.size() - 1);
        }
    }

    private boolean lastElementsEqual(final List<Character> pathRootToStart, final List<Character> pathRootToDest) {
        return !pathRootToStart.isEmpty() && !pathRootToDest.isEmpty() &&
            pathRootToDest.get(pathRootToDest.size() - 1).equals(pathRootToStart.get(pathRootToStart.size() - 1));
    }

    private List<Character> find(final PlainTree root, final int startValue) {
        if (root == null) {
            return null;
        }
        if (root.val == startValue) {
            //found destination
            return new ArrayList<>();
        }
        final List<Character> toLeft = this.find(root.left, startValue);
        final List<Character> toRight = this.find(root.right, startValue);
        if (toLeft != null) {
            toLeft.add('L');
            return toLeft;
        }
        if (toRight != null) {
            toRight.add('R');
            return toRight;
        }
        return null;
    }
}
