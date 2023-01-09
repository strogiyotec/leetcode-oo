package leetcode.oo.dp.greedy;

//https://leetcode.com/problems/string-without-aaa-or-bbb/
final class StringWithoutAAA {

    public String strWithout3a3b(int a, int b) {
        final StringBuilder builder = new StringBuilder(a + b);
        while (a + b > 0) {
            final int length = builder.length();
            if (length >= 2 && builder.charAt(length - 1) == builder.charAt(length - 2)) {
                if (builder.charAt(length - 1) == 'a') {
                    builder.append('b');
                    b--;
                } else {
                    builder.append('a');
                    a--;
                }
            } else {
                if (a > b) {
                    builder.append('a');
                    a--;
                } else {
                    builder.append('b');
                    b--;
                }
            }
        }
        return builder.toString();
    }
}
