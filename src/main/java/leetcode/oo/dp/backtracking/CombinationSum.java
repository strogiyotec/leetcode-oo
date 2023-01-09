package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Combination Sum.
 * See {@link <a href ="https://leetcode.com/problems/combination-sum/">https://leetcode.com/problems/combination-sum/</a>}
 */
final class CombinationSum {

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        final List<List<Integer>> combinations = new ArrayList<>();
        this.combinations(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void combinations(final int[] candidates, final int target, final int position, final ArrayList<Integer> sum, final List<List<Integer>> combinations) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(sum));
        }
        for (int i = position; i < candidates.length; i++) {
            sum.add(candidates[i]);
            this.combinations(candidates, target - candidates[i], i, sum, combinations);
            sum.remove(candidates[i]);
        }
    }
}
