package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public final class FindDuplicatesInArray {

    public static void main(final String[] args) {
        System.out.println(new FindDuplicatesInArray().findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public List<Integer> findDuplicates(final int[] nums) {
        final List<Integer> solution = new ArrayList<>(nums.length + 1);
        for (int i = 0; i < nums.length; i++) {
            final int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                solution.add(index);
            } else {
                nums[index - 1] = Math.negateExact(nums[index - 1]);
            }
        }
        return solution;
    }
}
