package leetcode.oo.arrays;

//https://leetcode.com/problems/find-the-winner-of-an-array-game/
public final class ArrayGame {

    public static void main(String[] args) {
        System.out.println(new ArrayGame().getWinner(new int[]{2, 1, 3, 5, 4, 6, 7}, 2));
    }

    public int getWinner(final int[] arr, final int k) {
        int wins = 0;
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > current) {
                current = arr[i];
                wins = 0;
            }
            wins++;
            if (wins == k) {
                return current;
            }
        }
        return current;
    }
}
