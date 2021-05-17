package leetcode.oo.strings;

//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
final class SquareIsWhite {

    boolean squareIsWhite(String coordinates) {
        final int letter = coordinates.charAt(0);
        final int number = Character.getNumericValue(coordinates.charAt(1));
        if (letter % 2 == 0) {
            return number % 2 != 0;
        } else {
            return number % 2 == 0;
        }

    }
}
