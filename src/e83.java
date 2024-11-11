import base.ListNode;
class e83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null ) {
            return head;
        }
        // 新增一個鏈，指向和 head 同一個鏈
        ListNode current = head;

        while(current!=null&&current.next!=null){
            // 假如下一個節點與當前相同
            if(current.val == current.next.val){
                // 跳過下一個節點，到下下一個
                current.next = current.next.next;
            }else{
                // 移動到下一個節點
                current = current.next;
            }
        }
        return head;

    }

    public static  void  main(String[] args){
        // 多組測試數據
        int[][] testCases = {
                {1,1,2},
                {1,1,2,3,3},
                {1, 1, 1, 2, 2},
                {2, 2, 2, 2},
                {}
        };

        // 遍歷測試每一組數據
        for (int[] testCase : testCases) {
            ListNode head = ListNode.buildList(testCase); // 建立鏈表

            System.out.print("原始鏈表: ");
            ListNode.printList(head);                     // 打印原始鏈表

            ListNode result = deleteDuplicates(head); // 刪除重複節點

            System.out.print("處理後鏈表: ");
            ListNode.printList(result);                   // 打印處理後的鏈表

            System.out.println("---");
        }
    }
}


