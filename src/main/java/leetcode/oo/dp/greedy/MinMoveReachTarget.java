package leetcode.oo.dp.greedy;

//https://leetcode.com/problems/minimum-moves-to-reach-target-score/description/
public final class MinMoveReachTarget {

    public static void main(String[] args) {
        System.out.println(new MinMoveReachTarget().minMoves(
            888928450, 5
        ));
    }

    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while (target != 1) {
            if (target % 2 == 0 && maxDoubles != 0) {
                maxDoubles--;
                target /= 2;
                moves++;
            } else if (maxDoubles != 0) {
                target--;
                moves++;
            } else {
                moves += target - 1;
                break;
            }
        }
        return moves;
    }
}
