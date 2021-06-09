package leetcode.oo.arrays;

//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
public final class MakeArrayIncreasing {

    public static void main(String[] args) {
        System.out.println(new MakeArrayIncreasing().minOperations(
            new int[]{1,1,1}
        ));
        System.out.println(new MakeArrayIncreasing().minOperations(
            new int[]{1, 5, 2, 4, 1}
        ));
    }

    public int minOperations(final int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                final int before = nums[i + 1];
                nums[i + 1] = nums[i] + 1;
                steps += nums[i + 1] - before;
            }
        }
        return steps;
    }
}
