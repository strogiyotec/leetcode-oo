package leetcode.oo.arrays;

//https://leetcode.com/problems/find-k-th-smallest-pair-distance/
 final class KthSmallest {

    public int smallestDistancePair(final int[] nums, int k) {
        final int[] buckets = new int[1_000_000];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                buckets[Math.abs(nums[i]-nums[j])]++;
            }
        }
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i]<k){
                k-=buckets[i];
            } else{
                return i;
            }
        }
        return -1;
    }
}
