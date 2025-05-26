class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currTank = 0;
        int total = 0;
        int remain = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            remain = gas[i] - cost[i];
            currTank += remain;
            total += remain;

            if(currTank < 0) {
                start = i + 1;
                currTank = 0;
            }
        }

        return total >=0 ? start : -1;
    }
}