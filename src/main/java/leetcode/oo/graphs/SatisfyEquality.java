package leetcode.oo.graphs;

//https://leetcode.com/problems/satisfiability-of-equality-equations/
public final class SatisfyEquality {

    public static void main(String[] args) {
        System.out.println(new SatisfyEquality().equationsPossible(
            new String[]{
                "c==c", "b==d", "x!=z"
            }
        ));
    }

    public boolean equationsPossible(final String[] equations) {
        final int[] graph = new int[27];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = i;
        }
        for (final String equation : equations) {
            if (equation.charAt(1) == '=') {
                graph[this.find(graph,equation.charAt(0)-'a')] = this.find(graph,equation.charAt(3)-'a');
            }
        }
        for (final String equation : equations) {
            if (equation.charAt(1) == '!') {
                final char first = equation.charAt(0);
                final char second = equation.charAt(3);
                if (this.find(graph, first-'a') == this.find(graph, second-'a')) {
                    return false;
                }
            }
        }
        return true;
    }

    private int find(final int[] graph, final int c) {
        if (c != graph[c]) {
            graph[c] = this.find(graph, graph[c]);
        }
        return graph[c];
    }
}
