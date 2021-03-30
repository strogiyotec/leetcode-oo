package leetcode.oo.arrays;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
final class NumberOfStudentsWithoutLunch {

    int countStudents(
        final int[] students,
        final int[] sandwiches
    ) {
        final Queue<Integer> studQueue = IntStream.of(students).boxed().collect(Collectors.toCollection(ArrayDeque::new));
        final Queue<Integer> sandQueue = IntStream.of(sandwiches).boxed().collect(Collectors.toCollection(ArrayDeque::new));
        while (!sandQueue.isEmpty()) {
            final int size = sandQueue.size();
            boolean atLeastOne = false;
            final Queue<Integer> tempStud = new ArrayDeque<>();
            for (int i = 0; i < size && !studQueue.isEmpty(); i++) {
                final Integer sandwich = sandQueue.peek();
                final Integer student = studQueue.peek();
                if (student.equals(sandwich)) {
                    sandQueue.poll();
                    studQueue.poll();
                    atLeastOne = true;
                } else {
                    tempStud.offer(studQueue.poll());
                }
            }
            if (atLeastOne) {
                studQueue.addAll(tempStud);
            } else {
                return tempStud.size();
            }
        }
        return 0;
    }
}
