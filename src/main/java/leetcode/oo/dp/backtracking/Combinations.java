package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;


/**
 * Combinations.
 * See {@link <a href ="https://leetcode.com/problems/combinations/">https://leetcode.com/problems/combinations/</a>}
 */
final class Combinations {

    List<List<Integer>> combine(final int numbers, int length) {
        final List<List<Integer>> combinations = new ArrayList<>();
        final List<Integer> currentComb = new ArrayList<>();
        this.combine(combinations, currentComb, numbers, length, 1);

        return combinations;
    }

    private void combine(final List<List<Integer>> combinations, final List<Integer> storage, final int numbers, final int length, final int position) {
        if (storage.size() == length) {
            combinations.add(new ArrayList<>(storage));
            return;
        }
        for (int i = position; i <= numbers; i++) {
            storage.add(i);
            this.combine(combinations, storage, numbers, length, i + 1);
            storage.remove(storage.size() - 1);
        }
    }
}
