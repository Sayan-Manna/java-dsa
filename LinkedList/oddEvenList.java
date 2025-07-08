package LinkedList;

/*
Segregate even and odd nodes in LinkedList
Given a LinkedList of integers. Modify the LinkedList in such a way that in Modified LinkedList all the even numbers appear before all the odd numbers in LinkedList.
Also, note that the order of even and odd numbers should remain the same.

Input: 1→2→3→4→5→6→Null
Output: 2→4→6→1→3→5→Null
Explanation :
Odd Nodes in LinkedList are 1,3,5 and
Even Nodes in LinkedList are 2,4,6
In Modified LinkedList all even Nodes comes before
all Odd Nodes. So Modified LinkedList looks like
2→4→6→1→3→5→Null. Order of even and odd Nodes is
maintained in modified LinkedList.

Input: 1→3→5→Null
Output: 1→3→5→Null
Explantion: As there are no Even Nodes in LinkedList,
The Modified LinkedList is same as Original LinkedList.

 */

import static LinkedList.insertingInLL.Display;

public class oddEvenList {
    private static ListNode SegregatetoOddEVen(ListNode head) {
        // Optimal
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd != null && odd.next != null && even != null && even.next != null) {
            odd.next = even.next; // Link odd nodes
            odd = odd.next; // Move to the next odd node
            even.next = odd.next; // Link even nodes
            even = even.next; // Move to the next even node


        }

        even.next = head; // Connect the end of odd list to the head of even list
        odd.next = null; // End the odd list
        return evenHead; // Return the modified list starting from the head


        // Brute-force ------ O(n) time and O(n) space
//        ListNode oddHead = new ListNode(0);
//        ListNode oddTail = oddHead;
//        ListNode evenHead = new ListNode(0);
//        ListNode evenTail = evenHead;
//
//        ListNode curr = head;
//        int index = 1;
//        while (curr != null) {
//            if (index % 2 == 1) {
//                oddTail.next = curr;
//                oddTail = oddTail.next;
//            }else {
//                evenTail.next = curr;
//                evenTail = evenTail.next;
//            }
//            curr = curr.next;
//            index++;
//        }
//
//        evenTail.next = oddHead.next; // Connect odd and even lists
//        oddTail.next = null; // End the odd list
//        return evenHead.next; // next is used to skip the dummy node
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(arr[0]);

        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);
        head.next.next.next.next.next = new ListNode(arr[5]);

        ListNode newHead = SegregatetoOddEVen(head);
        Display(newHead);
    }

}
