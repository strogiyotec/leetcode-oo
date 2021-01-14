package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/course-schedule-ii/
final class CourseSchedule2 {

    int[] findOrder(int numCourses, int[][] prerequisites) {
        final HashMap<Integer, List<Integer>> map = new HashMap<>(prerequisites.length);
        for (final int[] prerequisite : prerequisites) {
            map.merge(prerequisite[0], new ArrayList<>(Collections.singletonList(prerequisite[1])), (oldList, list) -> {
                oldList.addAll(list);
                return oldList;
            });
        }
        final List<Integer> solution = new ArrayList<>(numCourses);
        final Set<Integer> cache = new HashSet<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            if (this.dfs(new HashMap<>(), map, solution, cache, i)) {
                return new int[]{};
            }
        }
        return solution.stream().mapToInt(f -> f).toArray();
    }

    @SuppressWarnings("ALL")
    private boolean dfs(
        final Map<Integer, Boolean> visited,
        final Map<Integer, List<Integer>> requisites,
        final List<Integer> solution,
        final Set<Integer> cache,
        final int course
    ) {
        visited.put(course, true);
        for (final Integer reqisite : requisites.getOrDefault(course, Collections.emptyList())) {
            if (visited.getOrDefault(reqisite, false) || this.dfs(visited, requisites, solution, cache, reqisite)) {
                return true;
            }
        }
        visited.remove(course);
        if (!cache.contains(course)) {
            cache.add(course);
            solution.add(course);
        }
        return false;
    }

}
