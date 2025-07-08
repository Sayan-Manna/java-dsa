package LinkedList;


public class sortLLOf012 {
    private static ListNode sortLL(ListNode head) {
        // Using Dummy List Node -----------| O(n) | O(1)
        if (head == null || head.next == null) {
            return head;
        }
        ListNode zeroHead = new ListNode(0);
        ListNode oneHead = new ListNode(0);
        ListNode twoHead = new ListNode(0);
        ListNode zeroTail = zeroHead;
        ListNode oneTail = oneHead;
        ListNode twoTail = twoHead;

        ListNode curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            } else if (curr.val == 1) {
                oneTail.next = curr;
                oneTail = oneTail.next;
            } else if (curr.val == 2) {
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;
        return zeroHead.next;


        //  Data Replacement + counting sort (Modifies values) -----------| O(n) | O(1)
        /*
        - Count the number of 0s, 1s, and 2s in the linked list
        - Traverse the linked list again and replace the values with 0s, 1s, and 2s in order
         */
//        int count0 = 0, count1 = 0, count2 = 0;
//        ListNode temp = head;
//        while (temp != null) {
//            if (temp.val == 0) {
//                count0++;
//            } else if (temp.val == 1) {
//                count1++;
//            } else if (temp.val == 2) {
//                count2++;
//            }
//            temp = temp.next;
//        }
//        temp = head;
//        while (temp != null) {
//            if (count0 > 0) {
//                temp.val = 0;
//                count0--;
//            } else if (count1 > 0) {
//                temp.val = 1;
//                count1--;
//            } else if (count2 > 0) {
//                temp.val = 2;
//                count2--;
//            }
//            temp = temp.next;
//        }
////        for (int i = 0; i < count0; i++) {
////            temp.val = 0;
////            temp = temp.next;
////        }
////        for (int i=count0; i<count0+count1; i++) {
////            temp.val = 1;
////            temp = temp.next;
////        }
////        for (int i=count0+count1; i<count0+count1+count2; i++) {
////            temp.val = 2;
////            temp = temp.next;
////        }

//        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(0);

        head = sortLL(head);

        // Print the sorted linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
