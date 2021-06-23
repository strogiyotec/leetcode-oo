package leetcode.oo.strings;

import java.util.Arrays;

//https://leetcode.com/problems/orderly-queue/
public final class OrderlyQueue {

    public static void main(String[] args) {
        System.out.println(new OrderlyQueue().orderlyQueue("cba", 1));
        System.out.println(new OrderlyQueue().orderlyQueue("baaca", 3));
    }

    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            final char[] array = s.toCharArray();
            Arrays.sort(array);
            return new String(array);
        } else {
            String temp = s;
            for (int i = 0; i < s.length(); i++) {
                String next = s.substring(i) + s.substring(0, i);
                if (temp.compareTo(next) > 0) {
                    temp = next;
                }
            }
            return temp;
        }
    }
}
