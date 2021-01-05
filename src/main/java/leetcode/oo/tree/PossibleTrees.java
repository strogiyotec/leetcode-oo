package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/all-possible-full-binary-trees/
final class PossibleTrees {

    List<PlainTree> allPossibleFBT(int N) {
        N--;
        if (N == 0) {
            return Collections.singletonList(new PlainTree(0));
        }
        final List<PlainTree> solution = new ArrayList<>(16);
        for (int i = 1; i < N; i += 2) {
            final List<PlainTree> left = this.allPossibleFBT(i);
            final List<PlainTree> right = this.allPossibleFBT(N - i);
            left.forEach(
                l -> right.forEach(
                    r -> {
                        final PlainTree tree = new PlainTree(0);
                        tree.left = l;
                        tree.right = r;
                        solution.add(tree);
                    }));
        }
        return solution;
    }
}
