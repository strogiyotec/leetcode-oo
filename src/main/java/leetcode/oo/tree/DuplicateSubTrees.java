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
        final Map<String, Integer> cnt = new HashMap<>(16);
        final List<PlainTree> storage = new ArrayList<>(16);
        this.dfs(cnt, storage, root);
        return storage;
    }

    private String dfs(final Map<String, Integer> cnt, final List<PlainTree> storage, final PlainTree root) {
        if (root == null) {
            return "#";
        }
        final String path = root.val + ',' + this.dfs(cnt, storage, root.left) + ',' + this.dfs(cnt, storage, root.right);
        if (cnt.merge(path, 1, Integer::sum) == 2) {
            storage.add(root);
        }
        return path;
    }

}
