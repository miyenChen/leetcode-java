package base;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static TreeNode build(int[] values) {
        if (values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (current != null) {
                if (i < values.length && values[i] != -1) {
                    current.left = new TreeNode(values[i]);
                    queue.offer(current.left);
                }
                i++;
                if (i < values.length && values[i] != -1) {
                    current.right = new TreeNode(values[i]);
                    queue.offer(current.right);
                }
                i++;
            }
        }
        return root;
    }

    public static void print(TreeNode root) {
        if (root == null) {
            System.out.println("null");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }
}
