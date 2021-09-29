package leetcode.oo.math;

//https://leetcode.com/problems/numbers-at-most-n-given-digit-set/
final class NumbersAtMostN {

    public int atMostNGivenDigitSet(final String[] digits, final int limit) {
        final String strLimit = String.valueOf(limit);
        int cnt = 0;
        cnt += this.withLengthLessThanLimit(strLimit.length(), digits);
        cnt += this.withSameDigits(strLimit, digits);
        return cnt;
    }

    private int withSameDigits(final String strLimit, final String[] digits) {
        int cnt = 0;
        for (int i = 0; i < strLimit.length(); i++) {
            boolean hasSameNum = false;
            for (final String digit : digits) {
                if (digit.charAt(0) < strLimit.charAt(i)) {
                    cnt += Math.pow(digits.length, strLimit.length() - i - 1);
                } else if (digit.charAt(0) == strLimit.charAt(i)) {
                    hasSameNum = true;
                }
            }
            if (!hasSameNum) {
                return cnt;
            }
        }
        return cnt + 1;
    }

    private int withLengthLessThanLimit(final int length, final String[] digits) {
        int cnt = 0;
        for (int i = 1; i < length; i++) {
            cnt += Math.pow(digits.length, i);
        }
        return cnt;
    }

}
