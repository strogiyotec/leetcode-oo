package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
final class MaxPointsObtain {

    int maxScore(final int[] cardPoints, final int k) {
        int leftScore = 0;
        for (int i = 0; i < k; i++) {
            leftScore += cardPoints[i];
        }
        int max = leftScore;
        for (int right = cardPoints.length - 1, left = k - 1; right >= cardPoints.length - k; right--, left--) {
            leftScore -= cardPoints[left];
            leftScore += cardPoints[right];
            max = Math.max(max, leftScore);
        }
        return max;
    }

}
