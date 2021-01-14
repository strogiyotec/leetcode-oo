package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/course-schedule/
final class CourseSchedule {

    boolean canFinish(final int numCourses, int[][] prerequisites) {
        final HashMap<Integer, List<Integer>> map = new HashMap<>(prerequisites.length);
        for (final int[] prerequisite : prerequisites) {
            map.merge(prerequisite[0], new ArrayList<>(Collections.singletonList(prerequisite[1])), (oldList, list) -> {
                oldList.addAll(list);
                return oldList;
            });
        }
        for (int i = 0; i < numCourses; i++) {
            if (this.dfs(new HashMap<>(16), map, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(final Map<Integer, Boolean> visited, final Map<Integer, List<Integer>> requisites, final int course) {
        visited.put(course, true);
        for (final Integer reqisite : requisites.getOrDefault(course, Collections.emptyList())) {
            if (visited.getOrDefault(reqisite, false) || this.dfs(visited, requisites, reqisite)) {
                return true;
            }
        }
        visited.remove(course);
        return false;
    }
}
