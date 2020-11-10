package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets2.
 * See {@link <a href ="https://leetcode.com/problems/subsets-ii/">https://leetcode.com/problems/subsets-ii/</a>}
 */
final class Subsets2 {

    List<List<Integer>> subsetsWithDup(final int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> subsets = new ArrayList<>(nums.length);
        this.subsets(0, nums, subsets, new ArrayList<>(16));
        return subsets;
    }

    private void subsets(final int position, final int[] array, final List<List<Integer>> subsets, final List<Integer> subset) {
        subsets.add(new ArrayList<>(subset));
        for (int i = position; i < array.length; i++) {
            if (i == position || array[i] != array[i - 1]) {
                subset.add(array[i]);
                this.subsets(i + 1, array, subsets, subset);
                subset.remove(subset.size() - 1);
            }
        }
    }

}
