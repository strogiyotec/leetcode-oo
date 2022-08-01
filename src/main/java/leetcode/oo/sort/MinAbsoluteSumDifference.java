package leetcode.oo.sort;

import java.util.TreeSet;

//https://leetcode.com/problems/minimum-absolute-sum-difference/
public final class MinAbsoluteSumDifference {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        final TreeSet<Integer> set = new TreeSet<>();
        for (final int i : nums1) {
            set.add(i);
        }
        int positionToReplace = -1;
        int valueToUse = 0;
        int maxDiff = 0;
        for (int i = 0; i < nums2.length; i++) {
            final int origDiff = Math.abs(nums2[i] - nums1[i]);
            final Integer floor = set.floor(nums2[i] - 1);
            if (floor != null) {
                int floorDiff = Math.abs(nums2[i] - floor);
                int diff = origDiff - floorDiff;
                if (diff > maxDiff) {
                    maxDiff = diff;
                    positionToReplace = i;
                    valueToUse = floor;
                }
            }
            final Integer ceiling = set.ceiling(nums2[i] + 1);
            if (ceiling != null) {
                int ceilingDiff = Math.abs(nums2[i] - ceiling);
                int diff = origDiff - ceilingDiff;
                if (diff > maxDiff) {
                    maxDiff = diff;
                    positionToReplace = i;
                    valueToUse = ceiling;
                }
            }
        }
        if (positionToReplace != -1) {
            nums1[positionToReplace] = valueToUse;
        }
        int sum = 0;
        final int mod = (int) 1.0e9 +7;
        for (int i=0; i<nums1.length; i++) {
            sum = (sum + Math.abs(nums1[i] - nums2[i])) % mod;
        }
        return sum;
    }
}
