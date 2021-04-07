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
        final Map<String, Map<String, Double>> graph = new HashMap<>(queries.size());
        for (final List<String> equation : equations) {
            graph.put(equation.get(0), new HashMap<>());
            graph.put(equation.get(1), new HashMap<>());
        }
        this.fill(graph, equations, values);
        final double[] answers = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            answers[i] = this.dfs(graph, queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
        }
        return answers;
    }

    private double dfs(
        final Map<String, Map<String, Double>> graph,
        final String dividend,
        final String divisor,
        final HashSet<String> cache
    ) {
        if (!graph.containsKey(dividend)) {
            return -1.0;
        }
        if (graph.get(dividend).containsKey(divisor)) {
            return graph.get(dividend).get(divisor);
        }
        cache.add(dividend);
        for (final String vertex : graph.get(dividend).keySet()) {
            if (!cache.contains(vertex)) {
                final double answer = this.dfs(graph, vertex, divisor, cache);
                if (answer != -1.0) {
                    return answer * graph.get(dividend).get(vertex);
                }
            }
        }
        return -1.0;
    }

    private void fill(final Map<String, Map<String, Double>> graph, final List<List<String>> equations, final double[] values) {
        for (int i = 0; i < equations.size(); i++) {
            graph.get(equations.get(i).get(0)).put(equations.get(i).get(1), values[i]);
            graph.get(equations.get(i).get(1)).put(equations.get(i).get(0), 1 / values[i]);
        }
    }
}
