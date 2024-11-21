import base.ListNode;

public class m2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode current = res;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.buildList(new int[]{2, 4, 3});
        ListNode l2 = ListNode.buildList(new int[]{5, 6, 4});
        ListNode.printList(addTwoNumbers(l1, l2));
    }
}
