package leetcode.oo.tree.path;

import leetcode.oo.tree.PlainTree;

import java.util.ArrayList;
import java.util.List;


/**
 * Path sum 2.
 * See {@link <a href ="https://leetcode.com/problems/path-sum-ii/">https://leetcode.com/problems/path-sum-ii/</a>}.
 */
final class PathSum2 {

    List<List<Integer>> pathSum(final PlainTree root, final int sum) {
        final List<List<Integer>> solution = new ArrayList<>();
        final Search search = new Search() {
            @Override
            public void find(final List<Integer> list, final PlainTree node, final int sum) {
                if (node == null) {
                    return;
                }
                if (node.left == null && node.right == null && sum - node.val == 0) {
                    list.add(node.val);
                    solution.add(new ArrayList<>(list));
                    list.remove(list.size() - 1);
                    return;
                }
                list.add(node.val);
                this.find(list, node.left, sum - node.val);
                this.find(list, node.right, sum - node.val);
                list.remove(list.size() - 1);
            }
        };
        search.find(new ArrayList<>(), root, sum);
        return solution;
    }

    interface Search {
        void find(final List<Integer> list, PlainTree node, int sum);
    }
}
