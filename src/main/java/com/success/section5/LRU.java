package com.success.section5;

public class LRU {

    public static class DoubleNode {
        public int key;
        public int val;

        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public static class DoubleList {

        private DoubleNode head;
        private DoubleNode tail;

        public DoubleList() {
            head = null;
            tail = null;
        }

        public void addNode(DoubleNode node) {

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.last = tail;
                tail = node;
            }
        }

        public void moveToTail(DoubleNode node) {
            if (tail == node) {
                return;
            }
            if (head == node) {
                head = node.next;
                head.last = null;
            } else {
                node.last.next = node.next.next;
                node.next.last = node.last;
            }

            node.last = tail;
            node.next = null;
            tail.next = node;
            tail = node;
        }

        public DoubleNode removeHead(DoubleNode node) {
            if (node == null) {
                return null;
            }
            DoubleNode ans = head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = ans.next;
                ans.next =null;
                ans.last =null;
            }
            return ans;
        }
    }


}
