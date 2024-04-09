package com.success.section3;

import java.util.jar.JarEntry;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        boolean sort = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, arr[j], arr[j + 1]);
                    sort = true;
                }
            }
            if (!sort) break;
            sort = false;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void cocktailSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean sort = false;
        int lastSwapIndex = 0;      // 记录最后一次交换的位置

        while (left < right) {
            for (int i = left; i < right; i++) {
                //for(;left < right;left++)
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sort = true;
                    lastSwapIndex = i;
                }
            }
            right = lastSwapIndex;
            if (!sort) {
                break;
            }
            sort = false;
            for (int i = right; i > left; i--) {
                //for(;right > left;right--)
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    sort = true;
                    lastSwapIndex = i;
                }
            }
            left = lastSwapIndex;
            if (!sort) {
                break;
            }
            sort = false;

        }
    }
}
