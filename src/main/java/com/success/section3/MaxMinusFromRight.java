package com.success.section3;

public class MaxMinusFromRight {

    public int getMaxMinusFromRight(int[] arr) {
        if (null ==arr ||arr.length < 2) {
            return -1;
        }
        int max = arr[0];
        int sumMax = max - arr[1];

        int n = arr.length;
        for (int i = 2; i < n; i++) {
            if (arr[i - 1] > max) {
                max = arr[i - 1];
            }
            int curMax = max - arr[i];
            if (curMax > sumMax) {
                sumMax = curMax;
            }
        }
        return sumMax;
    }
}
