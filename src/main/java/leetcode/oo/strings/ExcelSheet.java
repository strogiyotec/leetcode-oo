package leetcode.oo.strings;

//https://leetcode.com/problems/excel-sheet-column-title/
public final class ExcelSheet {

    public static void main(String[] args) {
        System.out.println(new ExcelSheet().convertToTitle(701));
    }

    public String convertToTitle(int columnNumber) {
        final StringBuilder builder = new StringBuilder(columnNumber);
        while (columnNumber != 0) {
            columnNumber--;
            builder.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }
}
