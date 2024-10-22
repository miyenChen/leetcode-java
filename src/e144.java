import base.BinaryTree;
import base.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class e144 {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        if(root==null) return arr;

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(curr.right != null){
                stack.push(curr.right);
            }

            // 後放的節點會在下次拿出來
            if(curr.left != null){
                stack.push(curr.left);
            }
            arr.add(curr.val);
            // System.out.println(curr.val);
        }
        return arr;
    }

    public static void main(String[] args) {
        List<List<Object>> testCases = Arrays.asList(
                Arrays.asList(1, null, 2, 3),
                Arrays.asList(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9),
                Arrays.asList(),
                Arrays.asList(1)
        );

        for (List<Object> testCase : testCases) {
            TreeNode tree = BinaryTree.build(testCase);
            BinaryTree.print(tree);

            List<Integer> preorderList = preorderTraversal(tree);
            System.out.println(preorderList);
        }
    }

}
