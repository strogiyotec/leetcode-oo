package leetcode.oo.arrays;

//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
final class NearestPoint {

    int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int smallestMan = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            final int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int manhattan = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                if (manhattan < smallestMan) {
                    smallestMan = manhattan;
                    index = i;
                } else if (manhattan == smallestMan) {
                    index = Math.min(index, i);
                }
            }
        }
        return index;
    }
}
