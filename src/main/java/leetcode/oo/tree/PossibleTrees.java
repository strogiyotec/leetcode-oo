package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/all-possible-full-binary-trees/
final class PossibleTrees {

    List<PlainTree> allPossibleFBT(int N) {
        if (N % 2 == 0) {
            return Collections.emptyList();
        }
        if (N == 1) {
            return Collections.singletonList(new PlainTree(0));
        }
        final List<PlainTree> solution = new ArrayList<>();
        for (int i = 1; i < N; i += 2) {
            final List<PlainTree> lefts = this.allPossibleFBT(i);
            final List<PlainTree> rights = this.allPossibleFBT(N - 1 - i);
            for (final PlainTree left : lefts) {
                for (final PlainTree right : rights) {
                    final PlainTree plainTree = new PlainTree(0);
                    plainTree.left = left;
                    plainTree.right = right;
                    solution.add(plainTree);
                }
            }
        }
        return solution;
    }
}
