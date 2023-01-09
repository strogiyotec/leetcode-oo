package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Permutations.
 * See {@link <a href ="https://leetcode.com/problems/permutations/">https://leetcode.com/problems/permutations/</a>}
 */
final class Permutations {

    List<List<Integer>> permute(final int[] nums) {
        final List<List<Integer>> list = new ArrayList<>();
        this.dfs(0, list, nums);
        return list;
    }

    private void dfs(final int index, final List<List<Integer>> list, final int[] nums) {
        if (index >= nums.length) {
            return;
        }
        if (index == nums.length - 1) {
            list.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            this.dfs(index + 1, list, nums);
            swap(i, index, nums);
        }
    }

    private void swap(final int from, final int to, final int[] nums) {
        final int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
