import base.BinaryTree;
import base.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class e94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // 持續往左節點，直到當前為null
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            // 從 stack 退回上一個有值的最左節點
            curr = stack.pop();
            arr.add(curr.val);

            /* 右節點存在 => 會儲存右節點往下一層的左邊找
               右節點不存在 => 再次從 stack 退一個節點
             */
            curr = curr.right;
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

            List<Integer> preorderList = inorderTraversal(tree);
            System.out.println(preorderList);
        }
    }
}


