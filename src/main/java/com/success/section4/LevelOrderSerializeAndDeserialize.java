package com.success.section4;

public class LevelOrderSerializeAndDeserialize {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v) {
            val = v;
        }
    }

    public static TreeNode[] queue = new TreeNode[2001];

    public static int l, r;

    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            l = r = 0;
            builder.append(root.val);
            queue[r++] = root;
            while (l < r) {
                TreeNode cur = queue[l++];
                if (cur.left != null) {
                    builder.append(cur.left.val).append(",");
                    queue[r++] = cur.left;
                } else {
                    builder.append("#,");
                }
                if (cur.right != null) {
                    builder.append(cur.right.val).append(",");
                    queue[r++] = cur.right;
                } else {
                    builder.append("#,");
                }
            }

        }
        return builder.toString();
    }


    public TreeNode deSerialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        int index = 0;
        String[] nodes = data.split(",");
        l = r = 0;
        TreeNode root = generateNode(nodes[index++]);
        queue[r++] = root;
        while (l < r) {
            TreeNode cur = queue[r++];
            cur.left = generateNode(nodes[index++]);
            cur.right = generateNode(nodes[index++]);
            if (cur.left != null) {
                queue[r++] = cur.left;
            }
            if (cur.right != null) {
                queue[r++] = cur.right;
            }
        }
        return root;
    }

    private TreeNode generateNode(String val) {
        return val.equals("#") ? null : new TreeNode(Integer.parseInt(val));
    }
}
