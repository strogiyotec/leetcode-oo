package leetcode.oo.math;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//https://leetcode.com/problems/random-pick-with-weight/
public final class RandomPickWithHeight {

    public static void main(String[] args) {
        final RandomPickWithHeight pick = new RandomPickWithHeight(new int[]{1, 3});
        for (int i = 0; i < 4; i++) {
            System.out.println(pick.pickIndex());
        }
    }

    private final List<Integer> picks;

    private int total;

    public RandomPickWithHeight(int[] w) {
        this.picks = new ArrayList<>(w.length + 1);
        int total = 0;
        for (final int i : w) {
            total += i;
            this.picks.add(total);
        }
        this.total = total;
    }

    public int pickIndex() {
        final int random = ThreadLocalRandom.current().nextInt(1, this.total + 1);
        for (int i = 0; i < this.picks.size(); i++) {
            if (random <= this.picks.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
