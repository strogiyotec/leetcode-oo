package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.Map;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/most-frequent-subtree-sum/
public final class MostFrequentSum {

    private int max = 0;

    public int[] findFrequentTreeSum(final PlainTree root) {
        final Map<Integer, Integer> sumCnt = new HashMap<>();
        this.findMax(sumCnt, root);
        return sumCnt.entrySet().stream().filter(entry -> entry.getValue() == this.max).mapToInt(Map.Entry::getKey).toArray();
    }

    private int findMax(final Map<Integer, Integer> sumCnt, final PlainTree root) {
        if (root == null) {
            return 0;
        }
        int left = this.findMax(sumCnt, root.left);
        int right = this.findMax(sumCnt, root.right);
        int sum = left + right + root.val;
        final Integer cnt = sumCnt.merge(sum, 1, Integer::sum);
        this.max = Math.max(cnt,this.max);
        return sum;
    }

}
