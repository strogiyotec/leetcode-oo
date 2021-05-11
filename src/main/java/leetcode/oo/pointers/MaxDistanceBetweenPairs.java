package leetcode.oo.pointers;

//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
final class MaxDistanceBetweenPairs {

    int maxDistance(final int[] nums1, final int[] nums2) {
        int firstIndex = 0;
        int secondIndex = 0;
        int max = 0;
        while (firstIndex < nums1.length && secondIndex < nums2.length) {
            if (nums1[firstIndex] > nums2[secondIndex]) {
                firstIndex++;
            } else {
                if (secondIndex >= firstIndex) {
                    max = Math.max(max, secondIndex - firstIndex);
                }
                secondIndex++;
            }
        }
        return max;
    }
}
