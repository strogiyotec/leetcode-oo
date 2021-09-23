package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
final class MaxPointsObtain {

    int maxScore(final int[] cardPoints, final int k) {
        int score = 0;
        for (int i = 0; i < k; i++) {
            score += cardPoints[i];
        }
        int max = score;
        int left = k-1;
        int right = cardPoints.length - 1;
        while (left >= 0) {
            score -= cardPoints[left];
            score += cardPoints[right];
            max = Math.max(max,score);
            left--;
            right--;
        }
        return max;
    }

}
