package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/third-maximum-number/
public final class ThirdLargest {

    public static void main(String[] args) {
        System.out.println(new ThirdLargest().thirdMax(
            new int[]{1,2}
        ));
    }

    public int thirdMax(final int[] nums) {
        final Set<Integer> cache = new HashSet<>(nums.length);
        final PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length);
        for (final int num : nums) {
            if (!cache.contains(num)) {
                queue.offer(num);
                cache.add(num);
                if (queue.size() > 3) {
                    queue.poll();
                }
            }
        }
        if (queue.size() != 3) {
            while (!queue.isEmpty()) {
                final Integer poll = queue.poll();
                if (queue.isEmpty()) {
                    return poll;
                }
            }
        }
        return queue.poll();
    }
}
