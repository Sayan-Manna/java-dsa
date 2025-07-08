package LinkedList;

public class removeMiddle {
    private static ListNode dltMid(ListNode head) {
        // Two Pointer : R(2x), L(1x)
        ListNode left = head;
        ListNode right = head;
        ListNode prevOfLeft = new ListNode(0); // To store the previous node of left
        // && is used because the node can be either null(if even) or node.next be null
        // therefore if one condition occurs the loop should stop. 1.0=0/0.1=0
        // also right.next!=null should be after right!=null, because if the node is
        // at null(if even) then we can't access the next address first of all, that'll throw error
        while (right != null && right.next != null) {
            right = right.next.next;
            // Store the previous of left
            prevOfLeft = left;
            left = left.next;
        }
        prevOfLeft.next = prevOfLeft.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10); // 10 -> 20 -> 30 -> 40 -> null
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        // head.next.next.next.next = new ListNode(50);
        ListNode temp = dltMid(head);
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
