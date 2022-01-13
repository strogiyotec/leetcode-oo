package leetcode.oo.math;

import java.util.stream.IntStream;

//https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
public final class RemoveMinAndMax {

    public static void main(String[] args) {
        System.out.println(
            new RemoveMinAndMax().minimumDeletions(
                new int[]{
                    2, 10, 7, 5, 4, 1, 8, 6
                }
            )
        );
    }

    public int minimumDeletions(final int[] nums) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        int right = Math.max(min, max);
        int left = Math.min(min, max);
        return IntStream.of(
            right + 1,
            nums.length - left,
            left+1 + nums.length - right
        ).min().getAsInt();
    }
}
