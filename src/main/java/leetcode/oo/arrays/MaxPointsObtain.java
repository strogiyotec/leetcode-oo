package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
final class MaxPointsObtain {

    int maxScore(final int[] cardPoints, final int k) {
        int leftScore = 0;
        for (int i = 0; i < k; i++) {
            leftScore += cardPoints[i];
        }
        int max = leftScore;
        int right = cardPoints.length - 1;
        int left = k - 1;
        while (right >= cardPoints.length - k && left >= 0) {
            leftScore -= cardPoints[left];
            leftScore += cardPoints[right];
            max = Math.max(max, leftScore);
            left--;
            right--;
        }
        return max;
    }

}
