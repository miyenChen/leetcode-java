
import base.TreeNode;
import base.BinaryTree;

import java.util.*;

class m2583 {
    public static long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return 0;
        List<Long> sums = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // 將根節點加入Queue
        int layer=0;

        while(!queue.isEmpty()){
            int times = queue.size();
            long count = 0;
            for(int i=0; i<times; i++){
                TreeNode curr = queue.poll(); // 從Queue中取出當前節點
                count+= curr.val;

                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
                // System.out.println(layer+" "+curr.val);
            }
            sums.add(count);
            layer++;
        }
        if(k>layer) return -1;

        // Collections.sort(sums); 小到大排列
        // Comparator.reverseOrder() 讓排列改為由大到小排序
        Collections.sort(sums, Comparator.reverseOrder());

        //sums 數列由 0 開始，所以要 -1
        return sums.get(k-1);

    }

    public static void main(String[] args) {

        int[][] testCases = {
                {5,8,9,2,1,3,7,4,6},
                {5,8,9,2,1,3,7}
        };

        for (int[] testCase : testCases) {
            TreeNode tree = BinaryTree.build(testCase);
            BinaryTree.print(tree);
            long result = kthLargestLevelSum(tree, 4); // 修改k的值進行測試
            System.out.println("Answer: " + result);
        }
    }
}