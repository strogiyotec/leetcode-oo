package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.Map;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/most-frequent-subtree-sum/
public final class MostFrequentSum {

    private int max = 0;

    public int[] findFrequentTreeSum(final PlainTree root) {
        final Map<Integer, Integer> sumToCnt = new HashMap<>();
        this.find(sumToCnt, root);
        return sumToCnt.entrySet().stream().filter(entry->entry.getValue().equals(this.max)).mapToInt(Map.Entry::getKey).toArray();
    }

    private int find(final Map<Integer, Integer> sumToCnt, final PlainTree root) {
        if (root != null) {
            final int sum = this.find(sumToCnt, root.left) + this.find(sumToCnt, root.right) + root.val;
            this.max = Math.max(this.max, sumToCnt.merge(sum, 1, Integer::sum));
            return sum;
        } else {
            return 0;
        }
    }

}
