package leetcode.oo.strings;

//https://leetcode.com/problems/decoded-string-at-index/
public final class DecodeStrInIndex {

    public static void main(String[] args) {
        System.out.println(new DecodeStrInIndex().decodeAtIndex(
            "leet2code3",
            10
        ));
        System.out.println(new DecodeStrInIndex().decodeAtIndex(
            "a2b3c4d5e6f7g8h9",
            9
        ));
        System.out.println(new DecodeStrInIndex().decodeAtIndex(
            "ha22",
            5
        ));
        System.out.println(new DecodeStrInIndex().decodeAtIndex(
            "a2345678999999999999999",
            1
        ));
    }

    public String decodeAtIndex(
        final String s,
        final int k
    ) {
        int length = 0;
        final StringBuilder builder = new StringBuilder(s.length());
        char currentChar;
        int index = 0;
        while (index < s.length()) {
            if (Character.isLetter(s.charAt(index))) {
                while (Character.isLetter(s.charAt(index))) {
                    currentChar = s.charAt(index);
                    builder.append(s.charAt(index));
                    index++;
                    length++;
                    if (length == k) {
                        return String.valueOf(currentChar);
                    }
                }
            } else {
                final int number = Character.getNumericValue(s.charAt(index));
                final String temp = builder.toString();
                for (int i = 0; i < number-1; i++) {
                    for (int j = 0; j < temp.length(); j++) {
                        builder.append(temp.charAt(j));
                        length++;
                        currentChar= temp.charAt(j);
                        if(length == k){
                            return String.valueOf(currentChar);
                        }
                    }
                }
                index++;
            }
        }
        return "";
    }

}
