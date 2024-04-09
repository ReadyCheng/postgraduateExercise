package com.success.section3;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow5 {

    //一个整数数组，有一个大小为k的滑动窗口从左到右。你只能看到窗口内的k个数字。窗口每次向后一位。返回窗口中的最大值
    // 例如
    // 输入： [1,,3,-1,-3,5,3,6,7] ,k=3
    //输出：[3,3,5,5,6,7]
    public int[] getKArr(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();

            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.addLast(i);

            if (i >= k-1 && deque.peekFirst() !=null ) ans[index++] = arr[deque.peekFirst()];

        }
        return ans;
    }
}
