package leetcode.oo.arrays;

//https://leetcode.com/problems/minimum-numbers-of-function-calls-to-make-target-array/
public final class MinNumberFuncCalls {

    public static void main(String[] args) {
        System.out.println(new MinNumberFuncCalls().minOperations(
            new int[]{
                3, 2, 2, 4
            }
        ));
    }

    public int minOperations(final int[] nums) {
        long sum = 0;
        for (final int num : nums) {
            sum += num;
        }
        int operations = 0;
        while (sum != 0L) {
            boolean hasOdd = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    hasOdd = true;
                    nums[i]--;
                    operations++;
                    sum--;
                }
            }
            if (!hasOdd) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] /= 2;
                }
                operations++;
                sum /= 2;
            }
        }
        return operations;
    }
}
