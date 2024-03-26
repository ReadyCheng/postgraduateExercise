package com.success.section3;

public class SlidingWindow {

    public int getShortestArray(int[] arr, int target) {
        int N = arr.length;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int left = 0, right = 0; right < N; right++) {
            sum += arr[left];

            while (sum - arr[left] >= target) {
                sum -= arr[left++];
            }
            if (sum >= target) {
                ans = Math.min(ans, right - left + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
