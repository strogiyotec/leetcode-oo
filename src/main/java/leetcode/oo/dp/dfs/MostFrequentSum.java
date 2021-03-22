package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.Map;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/most-frequent-subtree-sum/
public final class MostFrequentSum {

    private int max = 0;

    public int[] findFrequentTreeSum(final PlainTree root) {
        final Map<Integer, Integer> cnt = new HashMap<>();
        this.dfs(root, cnt);
        return cnt.entrySet().stream().filter(entry -> entry.getValue().equals(this.max))
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }

    public int dfs(final PlainTree tree, final Map<Integer, Integer> cnt) {
        if (tree == null) {
            return 0;
        }
        final int sum = this.dfs(tree.left, cnt) + this.dfs(tree.right, cnt) + tree.val;
        this.max = Math.max(
            this.max,
            cnt.merge(sum, 1, Integer::sum)
        );
        return sum;
    }
}
