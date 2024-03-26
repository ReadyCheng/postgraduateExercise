package com.success.section3;

import java.util.Arrays;

public class SlidingWindow2 {

    public int getLongestSubArray(String str) {
        char[] s = str.toCharArray();
        int n = s.length;
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int ans = 0;
        for (int r = 0, l = 0; r < n; r++) {
            l = Math.max(l, last[s[r]] + 1);
            ans = Math.max(ans, r - l + 1);
            //存放字符对应值作为下标，实际值作为下标
            last[s[r]] = r;
        }
        return ans;
    }
}
