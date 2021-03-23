package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
final class MaxPointsObtain {

    int maxScore(final int[] cardPoints, final int k) {
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        int rightSum = 0;
        int max = leftSum;
        for (int i = 0; i < k; i++) {
            leftSum -= cardPoints[k - i - 1];
            rightSum += cardPoints[cardPoints.length - 1 - i];
            max = Math.max(max, leftSum + rightSum);
        }
        return max;
    }

}
