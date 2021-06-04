package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/
public final class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(new SummaryRanges().summaryRanges(
            new int[]{0,2,3,4,6,8,9}
        ));
        System.out.println(new SummaryRanges().summaryRanges(
            new int[]{0, 1, 2, 4, 5, 7}
        ));
    }

    public List<String> summaryRanges(final int[] nums) {
        final List<String> solution = new ArrayList<>(nums.length);
        int from = 0;
        while (from < nums.length) {
            final StringBuilder builder = new StringBuilder(16);
            builder.append(nums[from]);
            int to = from;
            for (int j = from+1; j < nums.length; j++) {
                if (nums[j] - nums[to] == 1) {
                    to++;
                } else {
                    break;
                }
            }
            if (to != from) {
                builder.append("->").append(nums[to]);
                from = to;
            }
            from++;
            solution.add(builder.toString());
        }
        return solution;
    }
}
