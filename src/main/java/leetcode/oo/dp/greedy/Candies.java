package leetcode.oo.dp.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/candy/
final class Candies {

    int candy(final int[] ratings) {
        final int[] scores = new int[ratings.length];
        Arrays.fill(scores, 1);
        for (int i = 0; i < ratings.length; i++) {
            if (i + 1 < ratings.length) {
                if (ratings[i + 1] > ratings[i]) {
                    scores[i + 1] = scores[i] + 1;
                }
            }
        }
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i - 1 >= 0) {
                if (ratings[i - 1] > ratings[i] && scores[i - 1] <= scores[i]) {
                    scores[i - 1] = scores[i] + 1;
                }
            }
        }
        return IntStream.of(scores).sum();
    }
}
