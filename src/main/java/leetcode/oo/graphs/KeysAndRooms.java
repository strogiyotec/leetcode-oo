package leetcode.oo.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/keys-and-rooms/
public final class KeysAndRooms {

    public static void main(String[] args) {
        System.out.println(new KeysAndRooms().canVisitAllRooms(
            List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(0)
            )
        ));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        final Set<Integer> set = IntStream.range(0, rooms.size()).boxed().collect(Collectors.toSet());
        final Set<Integer> visited = new HashSet<>(set.size(), 1.0F);
        final Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while(!queue.isEmpty()){
            final Integer room = queue.poll();
            if(!visited.contains(room)){
                visited.add(room);
                set.remove(room);
                final List<Integer> keys = rooms.get(room);
                for (final Integer key : keys) {
                    queue.offer(key);
                }
            }
        }
        return set.isEmpty();
    }
}
