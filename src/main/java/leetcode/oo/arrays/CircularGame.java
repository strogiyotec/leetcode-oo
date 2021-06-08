package leetcode.oo.arrays;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public final class CircularGame {

    public static void main(String[] args) {
        System.out.println(new CircularGame().findTheWinner(
            6, 5
        ));
    }

    public int findTheWinner(final int n, final int k) {
        final Queue<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            int deleteCnt = k - 1;
            while (deleteCnt != 0) {
                list.offer(list.poll());
                deleteCnt--;
            }
            list.poll();
        }
        return list.poll();
    }
}
