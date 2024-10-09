/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class e21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
}

/*
* 假設目前有兩條鏈
* list1 = [3, 4, 5]
* list2 = [1, 2, 6]
* 3 > 1 ， 所以保留 list2 第一個節點
* 繼續合併 list2.next = [2, 6] 和 list1 = [3, 4, 5]。
* 始終保持選擇較小的節點，遞迴處理剩下部分
* */

