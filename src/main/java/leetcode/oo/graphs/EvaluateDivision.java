package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/evaluate-division/
final class EvaluateDivision {

    double[] calcEquation(
        final List<List<String>> equations,
        final double[] values,
        final List<List<String>> queries
    ) {
        final Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            final List<String> equation = equations.get(i);
            graph.putIfAbsent(equation.get(0), new HashMap<>());
            graph.putIfAbsent(equation.get(1), new HashMap<>());
            graph.get(equation.get(0)).put(equation.get(1), values[i]);
            graph.get(equation.get(1)).put(equation.get(0), 1 / values[i]);
        }
        final double[] solution = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            solution[i] = this.dfs(graph, queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
        }
        return solution;
    }

    private double dfs(final Map<String, Map<String, Double>> graph, final String top, final String bottom, final HashSet<String> cache) {
        if (!graph.containsKey(top) || !graph.containsKey(bottom)) {
            return -1.0;
        }
        if (top.equals(bottom)) {
            return 1.0;
        }
        cache.add(top);
        for (final String key : graph.get(top).keySet()) {
            if (cache.contains(key)) {
                continue;
            }
            if (key.equals(bottom)) {
                return graph.get(top).get(key);
            }
            final double res = this.dfs(graph, key, bottom, cache);
            if (res != -1.0) {
                return graph.get(top).get(key) * res;
            }
        }
        return -1.0;
    }

}
