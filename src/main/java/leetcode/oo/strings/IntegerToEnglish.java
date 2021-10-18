package leetcode.oo.strings;

//https://leetcode.com/problems/integer-to-english-words/
final class IntegerToEnglish {

    private static final String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "0";
        }
        return this.convert(num);
    }

    private String convert(final int num) {
        final String output;
        if (num < 10) {
            output = belowTen[num];
        } else if (num < 20) {
            output = belowTwenty[num - 10];
        } else if (num < 100) {
            output = belowHundred[num / 10] + ' ' + this.convert(num % 10);
        } else if (num < 1000) {
            output = this.convert(num / 100) + " Hundred " + this.convert(num % 100);
        } else if (num < 1000_000) {
            output = this.convert(num / 1000) + " Thousand " + this.convert(num % 1000);
        } else if (num < 1000_000_000) {
            output = this.convert(num / 1000_000) + " Million " + this.convert(num % 1000_000);
        } else {
            output = this.convert(num / 1000_000_000) + " Billion " + this.convert(num % 1000_000_000);
        }
        return output.trim();
    }
}
