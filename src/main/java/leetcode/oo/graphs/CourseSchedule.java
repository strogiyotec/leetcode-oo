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
            if (this.dfs(i, adjacent, new HashSet<>())) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(final int course, final Map<Integer, Set<Integer>> adjacent, final HashSet<Integer> cache) {
        if (cache.contains(course)) {
            return true;
        }
        cache.add(course);
        for (final Integer requisite : adjacent.getOrDefault(course,Collections.emptySet())) {
            if (this.dfs(requisite, adjacent, cache)) {
                return true;
            }
        }
        cache.remove(course);
        return false;
    }

}
