package com.success.section3;

public class TakeWater {

    public int takeWater(int[] arr) {
        int leftMax = arr[0];
        int rightMax = arr[arr.length - 1];
        int l = 1;
        int r = arr.length - 2;
        int ans = 0;
        while (l < r) {
            if (leftMax <= rightMax) {
                ans += Math.max(0, leftMax - arr[l]);
                leftMax = Math.max(leftMax, arr[l++]);
            } else {
                ans += Math.max(0, rightMax - arr[r]);
                rightMax = Math.max(rightMax, arr[r--]);
            }
        }
        return ans;
    }
}
