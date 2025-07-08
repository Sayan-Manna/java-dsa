package LinkedList;

public class middleOfLL {
    private static ListNode MiddleOfLL(ListNode head) {
        // Two Pointer : R(2x), L(1x)
        ListNode slow = head;
        ListNode fast = head;
        // && is used because the node can be either null(if even) or node.next be null
        // therefore if one condition occurs the loop should stop. 1.0=0/0.1=0
        // Basically when fast is at 5 in LL: 1->2->3->4->5->null => slow is at 3 and fast.next is null
        // but due to and condition while becomes false -> loop stops -> if or is used -> error
        // also right.next!=null should be after right!=null, because if the node is
        // at null(if even) then we can't access the next address first of all, that'll throw error
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

        // Brute-force ---- O(N+ N/2) = O(N) | O(1)
        /*
        * Traverse and count the number of nodes in the linked list.
        * middle node = count/2 +1
        * Now I need to know the value of the middle node -> Traverse again
         */
//        ListNode temp = head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//        int middle = count / 2+1;
//        temp = head;
//        while (temp != null) {
//            middle -= 1;
//            if (middle == 0) {
//                break;
//            }
//            temp = temp.next;
//        }
//        return temp;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10); // 10 -> 20 -> 30 -> 50 -> null
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        // head.next.next.next.next = new ListNode(50);
        ListNode middle = (MiddleOfLL(head));
        System.out.println(middle.val);
    }
}
