import base.ListNode;

class e21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // list1 或 list2 沒有更多節點要合併，直接返回剩下所有節點
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;

        // 若其中一方較小，選擇第一個節點，並將剩下節點與另一個鏈繼續比較
        }else if(list1.val <=list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }


    public static  void  main(String[] args){
// 兩組分別放在不同數組，例如 {1, 2, 4}, {1, 3, 4} 和 {1, 3, 4}, {2, 4, 6}，同索引值的是同一組
        int[][] list1TestCases = {
                {1, 2, 4},
                {1, 3, 4}
        };

        int[][] list2TestCases = {
                {1, 3, 4},
                {2, 4, 6}
        };

        // 遍歷測試每一組數據
        for (int i = 0; i < list1TestCases.length; i++) {
            ListNode list1 = ListNode.buildList(list1TestCases[i]); // 建立鏈表1
            ListNode list2 = ListNode.buildList(list2TestCases[i]); // 建立鏈表2

            System.out.print("原始鏈表 1: ");
            ListNode.printList(list1);  // 打印鏈表1
            System.out.print("原始鏈表 2: ");
            ListNode.printList(list2);  // 打印鏈表2

            ListNode result = mergeTwoLists(list1, list2); // 合併兩個鏈表

            System.out.print("合併後鏈表: ");
            ListNode.printList(result); // 打印合併後的鏈表

            System.out.println("---");
        }
    }
}

/*
* 假設目前有兩條鏈
* list1 = [3, 4, 5]
* list2 = [1, 2, 6]
* 3 > 1 ， 所以保留 list2 第一個節點
* 繼續合併 list2.next = [2, 6] 和 list1 = [3, 4, 5]。
* 始終保持選擇較小的節點，遞迴處理剩下部分
* */

