package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public final class KidsWithGreatestCandies {

    public static void main(String[] args) {
        System.out.println(
            new KidsWithGreatestCandies().kidsWithCandies(
                new int[]{2, 3, 5, 1, 3}, 3
            ));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final List<Boolean> list = new ArrayList<>(candies.length + 1);
        final int max = IntStream.of(candies).max().getAsInt();
        for (final int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
