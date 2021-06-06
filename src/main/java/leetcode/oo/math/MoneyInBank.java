package leetcode.oo.math;

//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
public final class MoneyInBank {

    public static void main(String[] args) {
        System.out.println(new MoneyInBank().totalMoney(20));
    }

    public int totalMoney(final int n) {
        int factor = 1;
        int toAdd = 1;
        int cnt = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += toAdd;
            toAdd++;
            cnt++;
            if ((cnt - 1) % 7 == 0) {
                factor++;
                toAdd = factor;
            }
        }
        return sum;
    }
}
