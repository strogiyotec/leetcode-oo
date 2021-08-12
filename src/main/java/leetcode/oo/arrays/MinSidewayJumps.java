package leetcode.oo.arrays;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/minimum-sideway-jumps/
public final class MinSidewayJumps {

    public static void main(String[] args) {
        System.out.println(new MinSidewayJumps().minSideJumps(
            new int[]{
                0,1,1,3,3,0
            }
        ));
        System.out.println(new MinSidewayJumps().minSideJumps(
            new int[]{
                0, 1, 2, 3, 0
            }
        ));
    }

    public int minSideJumps(final int[] obstacles) {
        final Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{2, 0, 0});
        final Set<AbstractMap.SimpleEntry<Integer, Integer>> cache = new HashSet<>(obstacles.length);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                final int line = poll[0];
                final int jumps = poll[1];
                final int index = poll[2];
                var entry = new AbstractMap.SimpleEntry<>(line, index);
                if (obstacles[index] == line || cache.contains(entry)) {
                    continue;
                }
                cache.add(entry);
                if (index == obstacles.length - 1) {
                    return jumps;
                }
                for (int j = 1; j <= 3; j++) {
                    if (j == line) {
                        if (obstacles[index + 1] != line) {
                            queue.add(new int[]{line, jumps, index + 1});
                        }
                    } else {
                        if (obstacles[index] != j && !cache.contains(new AbstractMap.SimpleEntry<>(j,index))) {
                            queue.add(new int[]{j, jumps + 1, index});
                        }
                    }
                }
            }
        }
        return -1;
    }
}
