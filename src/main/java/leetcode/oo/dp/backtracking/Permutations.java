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

    private void dfs(final int left, final List<List<Integer>> list, final int[] array) {
        if (left == array.length - 1) {
            list.add(IntStream.of(array).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = left; i < array.length; i++) {
            swap(array, i, left);
            this.dfs(left + 1, list, array);
            swap(array, i, left);
        }
    }

    static private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
