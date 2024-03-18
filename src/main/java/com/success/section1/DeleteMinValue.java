package com.success.section1;

import java.util.Arrays;

public class DeleteMinValue {

    public int deleteMinValue(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int minIndex = -1;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        if (minIndex > 0) arr[minIndex] = arr[arr.length - 1];
        //  exclusive  to
        Arrays.copyOfRange(arr, 0, arr.length - 1);
        return minValue;
    }
}
