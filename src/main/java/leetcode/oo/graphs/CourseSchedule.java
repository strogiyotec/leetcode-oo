package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/course-schedule/
final class CourseSchedule {

    boolean canFinish(final int numCourses, int[][] prerequisites) {
        final Map<Integer, List<Integer>> graph = new HashMap<>(numCourses);
        for (final int[] prerequisite : prerequisites) {
            graph.merge(prerequisite[0], new ArrayList<>(List.of(prerequisite[1])), (oldV, newV) -> {
                oldV.addAll(newV);
                return oldV;
            });
        }
        final Map<Integer, Boolean> cache = new HashMap<>(numCourses << 1);
        for (int i = 0; i < numCourses; i++) {
            if (!this.dfs(i, new boolean[numCourses + 1], graph, cache)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(final int index, final boolean[] visited, final Map<Integer, List<Integer>> graph, final Map<Integer, Boolean> cache) {
        if (visited[index]) {
            return false;
        }
        if (cache.containsKey(index)) {
            return cache.get(index);
        }
        visited[index] = true;
        for (final Integer vertex : graph.getOrDefault(index, Collections.emptyList())) {
            if (!this.dfs(vertex, visited, graph, cache)) {
                return false;
            }
        }
//          let's say
//          3 ->1, 2
//          1 ->0
//          2 ->0
//          when we go to 1 from 3 and then to 0
//          then we need to set 0 back to false
//          otherwise when we go there from 2 it will be true
        visited[index] = false;
        cache.put(index, true);
        return true;
    }

}
