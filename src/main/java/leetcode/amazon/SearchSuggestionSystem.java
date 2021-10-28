package leetcode.amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/search-suggestions-system/
final class SearchSuggestionSystem {

    public List<List<String>> suggestedProducts(final String[] products, final String searchWord) {
        final List<List<String>> solution = new ArrayList<>(searchWord.length() + 1);
        for (int i = 1; i <= searchWord.length(); i++) {
            final PriorityQueue<String> queue = new PriorityQueue<>(3, Comparator.reverseOrder());
            final String sub = searchWord.substring(0, i);
            for (final String product : products) {
                if (product.startsWith(sub)) {
                    queue.offer(product);
                }
                if (queue.size() > 3) {
                    queue.poll();
                }
            }
            final LinkedList<String> currentSuggestions = new LinkedList();
            while (!queue.isEmpty()) {
                currentSuggestions.addFirst(queue.poll());
            }
            solution.add(currentSuggestions);
        }
        return solution;
    }
}
