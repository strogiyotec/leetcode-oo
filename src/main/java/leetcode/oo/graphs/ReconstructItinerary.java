package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/reconstruct-itinerary/
final class ReconstructItinerary {

    List<String> findItinerary(final List<List<String>> tickets) {
        final Deque<String> solution = new ArrayDeque<>();
        final Map<String, PriorityQueue<String>> adjacent = new HashMap<>(tickets.size());
        for (final List<String> ticket : tickets) {
            adjacent.computeIfAbsent(ticket.get(0), s -> new PriorityQueue<>()).add(ticket.get(1));
        }
        this.dfs(solution, adjacent, "JFK");
        return new ArrayList<>(solution);
    }

    private void dfs(
        final Deque<String> solution,
        final Map<String, PriorityQueue<String>> adjacent,
        final String currentFlight
    ) {
        while (adjacent.containsKey(currentFlight) && !adjacent.get(currentFlight).isEmpty()) {
            this.dfs(solution, adjacent, adjacent.get(currentFlight).poll());
        }
        solution.addFirst(currentFlight);
    }
}
