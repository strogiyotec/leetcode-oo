package leetcode.oo.dp.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * Lemonade Change.
 * See {@link <a href ="https://leetcode.com/problems/lemonade-change/">https://leetcode.com/problems/lemonade-change/</a>}.
 */
final class LemonadeChange {

    boolean lemonadeChange(final int[] bills) {
        final Map<Integer, Integer> map = new HashMap<>(bills.length + 2);
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.computeIfPresent(5, (key, oldVal) -> oldVal + 1);
            } else if (bills[i] == 10) {
                if (map.get(5) >= 1) {
                    map.computeIfPresent(5, (key, oldVal) -> oldVal - 1);
                    map.computeIfPresent(10, (key, oldVal) -> oldVal + 1);
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (map.get(5) >= 1 && map.get(10) != 0) {
                    map.computeIfPresent(5, (key, oldVal) -> oldVal - 1);
                    map.computeIfPresent(10, (key, oldVal) -> oldVal - 1);
                } else if (map.get(5) >= 3) {
                    map.computeIfPresent(5, (key, oldVal) -> oldVal - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
