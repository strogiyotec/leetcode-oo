package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/sell-diminishing-valued-colored-balls/
public final class SellDiminishingValues {

    public static void main(String[] args) {
        System.out.println(
            new SellDiminishingValues().maxProfit(
                new int[]{3,5}, 6
            )
        );
    }

    public int maxProfit(final int[] inventory, final int orders) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(inventory.length, Comparator.reverseOrder());
        for (final int i : inventory) {
            queue.add(i);
        }
        int currentOrders = 0;
        int sum = 0;
        final int mod = (int) (StrictMath.pow(10, 9) + 7);
        while (currentOrders != orders) {
            final Integer peek = queue.poll();
            sum += peek;
            if (peek - 1 != 0) {
                queue.add(peek - 1);
            }
            sum %= mod;
            currentOrders++;
        }
        return sum;
    }
}
