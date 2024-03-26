package com.success.section3;

public class QuickSort {

    public void recursiveImpl(int[] arr) {

        int l = 0;
        int r = arr.length - 1;
        int i = quickSort(arr, l, r);
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    private int quickSort(int[] arr, int l, int r) {
        int pivot = arr[l];
        while (l < r) {
            while (l < r && arr[r] > pivot) {
                r--;
            }
            arr[l] = arr[r];
            while (l < r && arr[l] < pivot) {
                l++;
            }
            arr[l] = arr[r];
        }
        arr[l] = pivot;
        return l;
    }
}
