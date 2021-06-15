package leetcode.oo.arrays.matrix;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public final class FlippingImage {

    public static void main(String[] args) {
        System.out.println(
            Arrays.deepToString(
                new FlippingImage().flipAndInvertImage(
                    new int[][]{
                        {1, 1, 0}, {1, 0, 1}, {0, 0, 0}
                    }
                )
            )
        );
        System.out.println(
            Arrays.deepToString(
                new FlippingImage().flipAndInvertImage(
                    new int[][]{
                        {1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}
                    }
                )
            )
        );
    }

    public int[][] flipAndInvertImage(final int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[0].length - 1;
            while (true) {
                if (image[0].length % 2 == 0) {
                    if (left>right) {
                        break;
                    }
                } else if (right == left) {
                    image[i][right] = image[i][right] == 1 ? 0 : 1;
                    break;
                }
                final int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                image[i][left] = image[i][left] == 1 ? 0 : 1;
                image[i][right] = image[i][right] == 1 ? 0 : 1;
                left++;
                right--;
            }
        }
        return image;
    }
}
