package leetcode.oo.strings;

//https://leetcode.com/problems/integer-to-english-words/
final class IntegerToEnglish {

    private static final String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0){
            return "0";
        }
        return this.convert(num);
    }

    private String convert(final int num) {
        final String english;
        if (num < 10) {
            english = belowTen[num];
        } else if (num < 20) {
            english = belowTwenty[num];
        } else if (num < 100) {
            english = belowHundred[num / 10] + ' ' + belowTen[num % 10];
        } else if (num < 1000) {
            english = convert(num / 100) + " Hundred " + this.convert(num % 100);
        } else if (num < 10_000) {
            english = convert(num / 1000) + " Thousands " + this.convert(num % 1000);
        } else if (num < 1000_000) {
            english = convert(num / 100_000) + " Million " + this.convert(num % 100_000);
        } else {
            english = convert(num / 1000_000) + " Billion " + this.convert(num % 1000_000);
        }
        return english.trim();
    }

}
