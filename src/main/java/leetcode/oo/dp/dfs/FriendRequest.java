package leetcode.oo.dp.dfs;

//https://leetcode.com/problems/process-restricted-friend-requests/
final class FriendRequest {

    public boolean[] friendRequests(final int n, final int[][] restrictions, final int[][] requests) {
        final int[] graph = new int[n];
        for (int i = 0; i < n; i++) {
            graph[i] = i;
        }
        final boolean[] solution = new boolean[requests.length];
        for (int i = 0; i < requests.length; i++) {
            final int firstP = this.find(graph, requests[i][0]);
            final int secondP = this.find(graph, requests[i][1]);
            if (firstP == secondP) {
                solution[i] = true;
                continue;
            }
            boolean hasConflict = false;
            for (final int[] restriction : restrictions) {
                final int firstR = this.find(graph, restriction[0]);
                final int secondR = this.find(graph, restriction[1]);
                if (firstR == firstP && secondR == secondP || firstR == secondP && secondR == firstP) {
                    hasConflict = true;
                    break;
                }
            }
            if(!hasConflict){
                solution[i] = true;
                graph[firstP] = secondP;
            }
        }
        return solution;
    }

    private int find(final int[] graph, final int node) {
        int parent = graph[node];
        while (parent != graph[parent]) {
            parent = graph[parent];
        }
        return parent;
    }
}
