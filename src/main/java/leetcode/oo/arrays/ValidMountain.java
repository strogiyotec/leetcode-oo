package leetcode.oo.arrays;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/valid-mountain-array/
public final class ValidMountain {

    public static void main(String[] args) {
        System.out.println(new ValidMountain().validMountainArray(
            new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
        ));
        System.out.println(new ValidMountain().validMountainArray(
            new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            }
        ));
        System.out.println(new ValidMountain().validMountainArray(
            new int[]{0, 2, 3, 4, 5, 2, 5, 0}
        ));
    }

    //0 2 3 4 5 2 1 0
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]);
        boolean top = false;
        int index = 1;
        while (index < arr.length && arr[index] > queue.peek()) {
            queue.poll();
            queue.offer(arr[index]);
            index++;
            top = true;
        }
        boolean bottom = false;
        while (index < arr.length && arr[index] < queue.peek()) {
            queue.poll();
            queue.offer(arr[index]);
            index++;
            bottom = true;
        }
        return top && bottom && index == arr.length;
    }
}
