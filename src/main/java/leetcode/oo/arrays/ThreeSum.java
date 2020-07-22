package leetcode.oo.arrays;

import java.util.*;

final class ThreeSum {

    public static void main(String[] args) {
    }

    List<List<Integer>> threeSum(int[] nums) {
        final Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                final int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    private List<List<Integer>> bruteForce(final int[] nums) {
        final Set<List<Integer>> solution = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        final List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.sort(Integer::compareTo);
                        solution.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(solution);
    }
}
