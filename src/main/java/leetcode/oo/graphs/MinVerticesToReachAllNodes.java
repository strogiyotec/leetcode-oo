package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
final class MinVerticesToReachAllNodes {

    List<Integer> findSmallestSetOfVertices(final int size, final List<List<Integer>> edges) {
        final Set<Integer> from = new HashSet<>(size);
        final Set<Integer> to = new HashSet<>(size);
        for (final List<Integer> edge : edges) {
            from.add(edge.get(0));
            to.add(edge.get(1));
        }
        from.removeAll(to);
        return new ArrayList<>(from);
    }
}
