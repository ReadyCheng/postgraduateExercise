package com.success.section3;

public class SlidingWindow4 {

    public int gasStation(int[] gas, int[] cost) {
        int n = gas.length;

        for (int l = 0, r = 0, len = 0, sum = 0; l < n; l++) {
            while (sum > 0) {
                if (len == n) {
                    return l;
                }
                r = (l + len++) % n;
                sum += gas[r] - cost[r];
            }
            len--;
            sum -= gas[l] - cost[l];
        }
        return -1;
    }
}
