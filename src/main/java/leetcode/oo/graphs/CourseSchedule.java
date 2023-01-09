package leetcode.oo.graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/course-schedule/
final class CourseSchedule {

    boolean canFinish(final int numCourses, int[][] prerequisites) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (final int[] prerequisite : prerequisites) {
            adjacent.merge(
                prerequisite[1],
                new HashSet<>(
                    Collections.singletonList(prerequisite[0])
                ),
                (oldVal, newVal) -> {
                    newVal.addAll(oldVal);
                    return newVal;
                }
            );
        }
        for (int i = 0; i < numCourses; i++) {
            if (!this.dfs(i, new boolean[numCourses + 1], adjacent)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(final int node, final boolean[] visited, final Map<Integer, Set<Integer>> adjacent) {
        if (visited[node]) {
            return false;
        }
        visited[node] = true;
        for (final Integer vertex : adjacent.getOrDefault(node, Collections.emptySet())) {
            if(!this.dfs(vertex,visited,adjacent)){
                return false;
            }
        }
        visited[node] = false;
        return true;
    }

}
