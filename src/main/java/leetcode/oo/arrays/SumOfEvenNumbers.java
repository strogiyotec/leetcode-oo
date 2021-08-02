package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
public final class SumOfEvenNumbers {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new SumOfEvenNumbers().sumEvenAfterQueries(
                    new int[]{
                        1, 2, 3, 4
                    },
                    new int[][]{
                        {1, 0}, {-3, 1}, {-4, 0}, {2, 3}
                    }
                )
            )
        );
    }

    public int[] sumEvenAfterQueries(
        final int[] nums,
        final int[][] queries
    ) {
        int evenSum = 0;
        for (final int num : nums) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            final int[] query = queries[i];
            final int num = nums[query[1]];
            final int added = num + query[0];
            if (num % 2 == 0) {
                evenSum -= num;
            }
            if (added % 2 == 0) {
                evenSum += added;
            }
            nums[query[1]] = added;
            answer[i] = evenSum;
        }
        return answer;
    }
}
