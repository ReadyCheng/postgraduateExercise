package com.success.section1;

import java.util.HashSet;

public class DeleteAllxValue {

    //Using java

    public static int[] deleteX(int[] arr, int x) {
        if (arr.length == 0) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                set.add(i);
            }
        }

        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            while (set.contains(end)) {
                end--;
            }
            if (i > end) break;
            if (set.contains(i)) {
                int temp = arr[i];
                arr[temp] = arr[end];
                arr[end] = temp;
                end--;
            }

        }
        int[] result = new int[end + 1];
        System.arraycopy(arr, 0, result, 0, end + 1);
        return result;
    }
}
