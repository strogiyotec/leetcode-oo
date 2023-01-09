package leetcode.oo.window;

import java.util.Arrays;


public final class KRadiusSubArrayAverage {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new KRadiusSubArrayAverage().getAverages(
                    new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3
                )
            )
        );
    }

    public int[] getAverages(int[] nums, int k) {
        final int[] solution = new int[nums.length];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k || i >= nums.length - k) {
                solution[i] = -1;
            }
            sum += nums[i];
            if (i >= 2 * k) {
                solution[i - k] = (int) (sum / (2 * k + 1));
                final int mostLeftIndex = i - (k << 1);
                sum -= nums[mostLeftIndex];
            }
        }
        return solution;
    }
}
