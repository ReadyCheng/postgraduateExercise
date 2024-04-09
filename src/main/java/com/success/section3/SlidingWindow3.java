package com.success.section3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow3 {

    public String minCoverSubArray(String str, String tar) {
        if (str.length() < tar.length()) {
            return "";
        }
        char[] s = str.toCharArray();
        char[] t = tar.toCharArray();
        int[] cnt = new int[256];
        for (char c : t) {
            cnt[c]--;
        }
        int len = Integer.MAX_VALUE;
        int start = 0;
        for (int l = 0, r = 0, debt = t.length; r < s.length; r++) {
            if (cnt[s[r]]++ < 0) {
                debt--;
            }
            if (debt == 0) {
                while (cnt[s[l]] > 0) {
                    cnt[s[l++]]--;
                }
//                len = Math.min(len, r - l + 1);
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    start = l;
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : str.substring(start, len);
    }


    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        // deque.offer() is better than add in return false
        System.out.println(deque.peekFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekLast());
    }
}
