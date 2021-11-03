package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/largest-divisible-subset/
final class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(final int[] nums) {
        if (nums.length < 2) {
            return IntStream.of(nums).boxed().collect(Collectors.toList());
        }
        Arrays.sort(nums);
        final List<List<Integer>> lists = new ArrayList<>(nums.length);
        for (final int num : nums) {
            lists.add(new ArrayList<>(Collections.singletonList(num)));
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && lists.get(i).size() < lists.get(j).size() + 1) {
                    final List<Integer> next = lists.get(i);
                    next.clear();
                    next.addAll(lists.get(j));
                    next.add(nums[i]);
                }
            }
        }
        return lists.stream().max(Comparator.comparingInt(List::size)).get();
    }
}
