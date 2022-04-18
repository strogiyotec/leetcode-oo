package leetcode.oo.arrays;

//https://leetcode.com/problems/can-place-flowers/
public final class CanPlaceFlowers {

    public static void main(final String[] args) {
        final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(
            new int[]{0, 0, 0, 0, 0, 1, 0, 0},
            0
        ));
    }

    public boolean canPlaceFlowers(final int[] flowerbed, final int n) {
        if (n == 0) {
            return true;
        }
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (canPlace(flowerbed, i)) {
                cnt++;
                flowerbed[i] = 1;
                if (cnt == n) {
                    break;
                }
            }
        }
        return cnt == n;
    }

    private static boolean canPlace(final int[] flowers, final int position) {
        if (flowers[position] == 1) {
            return false;
        }
        if (position - 1 >= 0 && flowers[position - 1] == 1) {
            return false;
        }
        if (position + 1 < flowers.length && flowers[position + 1] == 1) {
            return false;
        }
        return true;
    }
}
