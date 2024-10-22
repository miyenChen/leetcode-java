package base;

import java.util.LinkedList;
import java.util.*;

public class BinaryTree {
    public static TreeNode build(List<Object> arr) {
        if (arr.isEmpty() || arr.get(0) == null) return null;

        TreeNode root = new TreeNode((Integer) arr.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.size()) {
            TreeNode current = queue.poll();
            if (i < arr.size() && arr.get(i) != null) {
                current.left = new TreeNode((Integer) arr.get(i));
                queue.add(current.left);
            }
            i++;
            if (i < arr.size() && arr.get(i) != null) {
                current.right = new TreeNode((Integer) arr.get(i));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void print(TreeNode root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }
}

