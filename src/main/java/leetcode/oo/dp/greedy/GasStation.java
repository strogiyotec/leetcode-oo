package leetcode.oo.dp.greedy;

//https://leetcode.com/problems/gas-station/
final class GasStation {

    int canCompleteCircuit(final int[] gas, final int[] cost) {
        int start = 0;
        while (start < gas.length) {
            int index = start;
            int cnt = 0;
            int amountOfGas = 0;
            while (cnt != gas.length) {
                if (index == gas.length) {
                    index = 0;
                }
                amountOfGas += gas[index];
                amountOfGas -= cost[index];
                if (amountOfGas < 0) {
                    break;
                }
                index++;
                cnt++;
            }
            if (cnt == gas.length) {
                return start;
            }
            start++;
        }
        return -1;
    }
}
