public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 靜態方法，用於根據數組構建鏈表
//    public static ListNode buildList(int[] values) {
//        if (values.length == 0) return null;
//
//        ListNode head = new ListNode(values[0]);
//        ListNode current = head;
//
//        for (int i = 1; i < values.length; i++) {
//            current.next = new ListNode(values[i]);
//            current = current.next;
//        }
//
//        return head;
//    }

    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }
}
