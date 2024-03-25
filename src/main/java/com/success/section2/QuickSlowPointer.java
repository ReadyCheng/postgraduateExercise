package com.success.section2;

public class QuickSlowPointer {

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            //根据下标，每次走一步
            slow = nums[slow];
            //根据下标，走下一个下标，也就是走两步
            fast = nums[nums[fast]];
        } while (slow != fast);
        System.out.println("相遇点："+slow);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        new QuickSlowPointer().findDuplicate(new int[]{1,4,6,6,6,2,3});
    }
}
