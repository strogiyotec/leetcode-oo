package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find Duplicate Subtrees.
 * See {@link <a href ="https://leetcode.com/problems/find-duplicate-subtrees/">https://leetcode.com/problems/find-duplicate-subtrees/</a>}
 */
final class DuplicateSubTrees {

    List<PlainTree> findDuplicateSubtrees(final PlainTree root) {
        final Map<String, Integer> cnt = new HashMap<>();
        final List<PlainTree> trees = new ArrayList<>();
        this.preOrder(cnt, trees, root);
        return trees;
    }

    private String preOrder(final Map<String, Integer> cnt, final List<PlainTree> trees, final PlainTree node) {
        if (node == null) {
            return "#";
        }
        final String path = node.val + "," + this.preOrder(cnt, trees, node.left) + "," + this.preOrder(cnt, trees, node.right);
        if(cnt.merge(path,1,Integer::sum)==2){
            trees.add(node);
        }
        return path;
    }

}
