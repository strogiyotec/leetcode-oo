package leetcode.oo.arrays;

//https://leetcode.com/problems/ways-to-make-a-fair-array/
public final class FairArrayWays {

    public static void main(String[] args) {
        System.out.println(new FairArrayWays().waysToMakeFair(
            new int[]{2, 1, 6, 4}
        ));
    }

    public int waysToMakeFair(final int[] nums) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                oddSum += nums[i];
            } else {
                evenSum += nums[i];
            }
        }
        int removedOdd = 0;
        int removedEven = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                oddSum -= nums[i];
            } else {
                evenSum -= nums[i];
            }
            if (removedOdd + evenSum == removedEven + oddSum) {
                cnt++;
            }
            if (i % 2 == 0) {
                removedOdd += nums[i];
            } else {
                removedEven += nums[i];
            }
        }
        return cnt;
    }
}
