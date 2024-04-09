package com.success.section1;

public class ReverseOrderedList {

    // 1. if OrderList is Array

    public void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    //2. if OrderList is Node
    // TODO
    public static Node reverseNode(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        // TODO
//        while (true) {
//            Thread.sleep(0);
//        }
        return null;

    }

    static class Node {
        public int value ;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
