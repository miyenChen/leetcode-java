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
class e83 {
    public ListNode deleteDuplicates(ListNode head) {
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
}