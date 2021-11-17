package leetcode.oo.strings;

//https://leetcode.com/problems/zigzag-conversion/
public final class ZigZag {

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 3));
    }

    public String convert(final String s, final int numRows) {
        if (numRows == 1) {
            return s;
        }
        final StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder(s.length() / numRows + 1);
        }
        int step = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            builders[index].append(s.charAt(i));
            if (index == 0) {
                step = 1;
            }
            if (index == numRows - 1) {
                step = -1;
            }
            index += step;
        }
        final StringBuilder builder = new StringBuilder(s.length() + 1);
        for (final StringBuilder current : builders) {
            builder.append(current);
        }
        return builder.toString();
    }
}
