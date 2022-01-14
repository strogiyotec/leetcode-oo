package leetcode.oo.dp.sliding;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/fruit-into-baskets/
final class FruitIntoBackets {

    public int totalFruit(final int[] fruits) {
        final Map<Integer, Integer> fruitToIndex = new HashMap<>(fruits.length << 1);
        int startIndex = 0;
        int maxLength = 0;
        for (int end = 0; end < fruits.length; end++) {
            fruitToIndex.merge(fruits[end], 1, Integer::sum);
            while (fruitToIndex.size() > 2) {
                if (fruitToIndex.computeIfPresent(fruits[startIndex], (key, cnt) -> cnt - 1) == 0) {
                    fruitToIndex.remove(fruits[startIndex]);
                }
                startIndex++;
            }
            maxLength = Math.max(
                maxLength,
                end-startIndex+1
            );
        }
        return maxLength;
    }
}
