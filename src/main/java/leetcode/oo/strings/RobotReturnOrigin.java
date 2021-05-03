package leetcode.oo.strings;

//
final class RobotReturnOrigin {

    boolean judgeCircle(final String moves) {
        int left = 0;
        int top = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                left++;
            } else if (moves.charAt(i) == 'R') {
                left--;
            } else if (moves.charAt(i) == 'U') {
                top++;
            } else if (moves.charAt(i) == 'D') {
                top--;
            }
        }
        return top == 0 && left == 0;
    }
}
