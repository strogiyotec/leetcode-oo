package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Increasing Subsequences
public final class IncreasingSubsequence {

    public static void main(String[] args) {
        System.out.println(new IncreasingSubsequence().findSubsequences(new int[]{4, 4, 3, 2, 1}));
    }

    public List<List<Integer>> findSubsequences(final int[] nums) {
        final Set<List<Integer>> solution = new HashSet<>();
        this.dfs(0, nums, solution, new ArrayList<>());
        return new ArrayList<>(solution);
    }

    private void dfs(final int index, final int[] nums, final Set<List<Integer>> solution, final ArrayList<Integer> current) {
        if (current.size() >= 2) {
            solution.add(new ArrayList<>(current));
        }
        for (int i = index; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                current.add(nums[i]);
                this.dfs(i + 1, nums, solution, current);
                current.remove(current.size() - 1);
            }
        }

    }
}
