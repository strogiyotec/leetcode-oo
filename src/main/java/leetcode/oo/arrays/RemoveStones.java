package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/remove-stones-to-minimize-the-total/
public final class RemoveStones {

    public static void main(String[] args) {
        System.out.println(
            new RemoveStones().minStoneSum(
                new int[]{5, 4, 9}, 2
            )
        );
    }

    public int minStoneSum(int[] piles, int k) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(piles.length, Comparator.reverseOrder());
        int total = 0;
        for (final int pile : piles) {
            total += pile;
            queue.add(pile);
        }
        int steps = 0;
        while (steps != k) {
            final int poll = queue.poll();
            total -= poll;
            final int decreased = poll - poll / 2;
            total += decreased;
            queue.add(decreased);
            steps++;
        }
        return total;
    }
}
