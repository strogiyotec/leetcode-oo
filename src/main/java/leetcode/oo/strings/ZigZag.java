package leetcode.oo.strings;

//https://leetcode.com/problems/zigzag-conversion/
public final class ZigZag {

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 3));
    }

    public String convert(final String s, final int numRows) {
        if(numRows == 1){
            return s;
        }
        final StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }
        int builderIndex = 0;
        boolean forward = true;
        for (int i = 0; i < s.length(); i++) {
            builders[builderIndex].append(s.charAt(i));
            if (builderIndex == 0) {
                forward = true;
            }
            if (builderIndex == numRows - 1) {
                forward = false;
            }
            if (forward) {
                builderIndex++;
            } else {
                builderIndex--;
            }
        }
        final StringBuilder solution = new StringBuilder(s.length());
        for (int i = 0; i < numRows; i++) {
            solution.append(builders[i]);
        }
        return solution.toString();
    }
}
