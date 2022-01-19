package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
public final class XOfAKind {

    public static void main(String[] args) {
        System.out.println(
            new XOfAKind().hasGroupsSizeX(
                new int[]{
                    1, 1, 1, 2, 2, 2, 3, 3
                }
            )
        );
        System.out.println(
            new XOfAKind().hasGroupsSizeX(
                new int[]{
                    1, 2, 3, 4, 4, 3, 2, 1
                }
            )
        );
    }

    public boolean hasGroupsSizeX(int[] deck) {
        final Map<Integer, Integer> cnt = new HashMap<>(deck.length << 1);
        for (final int i : deck) {
            cnt.merge(i, 1, Integer::sum);
        }
        int res = 0;
        for (final Integer value : cnt.values()) {
            res = this.gcd(value, res);
        }
        return res > 1;
    }

    private int gcd(final int value, final int res) {
        if (res > 0) {
            return this.gcd(res, value % res);
        } else {
            return value;
        }
    }
}
