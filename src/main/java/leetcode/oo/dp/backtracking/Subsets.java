package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Subsets.
 * See {@link <a href ="https://leetcode.com/problems/subsets/submissions/">https://leetcode.com/problems/subsets/submissions/</a>}
 */
final class Subsets {

    List<List<Integer>> subsets(final int[] nums) {
        final List<List<Integer>> solution = new ArrayList<>();
        final Backtrack backtrack = new Backtrack() {
            @Override
            public void trackSets(final int index, final List<Integer> subset) {
                solution.add(new ArrayList<>(subset));
                for (int i = index; i < nums.length; i++) {
                    subset.add(nums[i]);
                    this.trackSets(i + 1, subset);
                    subset.remove(subset.size() - 1);
                }
            }
        };
        backtrack.trackSets(0, new ArrayList<>());
        return solution;
    }

    interface Backtrack {
        void trackSets(final int index, final List<Integer> subset);
    }
}
