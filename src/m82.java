class m82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        /* 建立一個新鏈，後面接上 head
        *  建立和 dummy 相同的 cur，用於操作
        *  假設 head = [1,1,2] , dummy = [0,1,1,2] , cur = [0,1,1,2]
        */
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        /* 因為開頭節點是多的，所以我們直接從下一個開始操作
        *  (把 cur.next 想成當前節點，cur.next.next想成下一個節點，會比較好懂)
        *  如果 cur.next 是 null，表示已經到鏈尾端，可以結束循環並返回結果。
        * */
        while ( cur.next != null){
            // 如果有下一個節點，並且值相同
            if(cur.next.next!=null && cur.next.val == cur.next.next.val){
                // 紀錄重複值
                int value = cur.next.val;

                /* 一次刪除一個，往後遍歷，直到沒有重複
                *  假如最後一個值重複 cur.next.next 會是 null
                */
                while(cur.next!=null&&cur.next.val==value){
                    cur.next =  cur.next.next;
                }
            }else{
                cur=cur.next;
            }
        }

        //開頭是一開始多加的節點，所以要去掉，返回剩下節點
        return dummy.next;

    }

    public static  void  main(String[] args){
        // 多組測試數據
        int[][] testCases = {
                {1,2,3,3,4,4,5},
                {1,1,1,2,3},
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

