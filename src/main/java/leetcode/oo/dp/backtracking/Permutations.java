package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Permutations.
 * See {@link <a href ="https://leetcode.com/problems/permutations/">https://leetcode.com/problems/permutations/</a>}
 */
final class Permutations {

    List<List<Integer>> permute(final int[] nums) {
        final List<List<Integer>> solution = new ArrayList<>();
        final Backtrack backtrack = new Backtrack() {
            @Override
            public void find(final int left, final int right) {
                if (left == right) {
                    solution.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
                    return;
                }
                for (int i = left; i <= right; i++) {
                    swap(nums, i, left);
                    this.find(left + 1, right);
                    swap(nums, i, left);
                }
            }
        };
        backtrack.find(0, nums.length - 1);
        return solution;
    }

    interface Backtrack {
        void find(int left, int right);
    }

    static private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
