package com.success.section4;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

    }

    public static int l, r;

    public static TreeNode[] queue = new TreeNode[2001];

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) {
            l = r = 0;
            queue[r++]  = root;
            while (l < r) {
                ArrayList<Integer> list = new ArrayList<>();
                int size = l - r;
                for (int i = 0; i < size; i++) {
                    TreeNode cur = queue[l++];
                    list.add(cur.val);
                    if (cur.left != null) {
                        queue[r++] = cur.left;
                    }
                    if (cur.right != null) {
                        queue[r++] = cur.right;
                    }
                }
                ans.add(list);
            }
        }
        return ans;
    }

}
