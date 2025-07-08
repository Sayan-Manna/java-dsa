package LinkedList;

import static LinkedList.Reverse.ReverseLL;

/*
Given the head of a singly linked list representing a positive integer number.
Each node of the linked list represents a digit of the number, with the 1st node containing the leftmost digit of the number and so on.
The task is to add one to the value represented by the linked list and return the head of a linked list containing the final value.

The number will contain no leading zeroes except when the value represented is zero itself.

Input: head -> 1 -> 2 -> 3
Output: head -> 1 -> 2 -> 4
Explanation: The number represented by the linked list = 123.
123 + 1 = 124.
----
Input: head -> 9 -> 9
Output: head -> 1 -> 0 -> 0
Explanation: The number represented by the linked list = 99.
99 + 1 = 100.
*/
public class addOneToNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        ListNode result = addOne(head);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }

    private static ListNode addOne(ListNode head) {
        // Optimal -------- O(n) time and O(1) space
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode lastNonNine = dummy;
        ListNode current = head;
        while (current != null) {
            if (current.val != 9) {
                lastNonNine = current;
            }
            current = current.next;
        }
        lastNonNine.val++;

        current = lastNonNine.next;
        while (current != null) {
            current.val = 0;
            current = current.next;
        }
        if (dummy.val == 1) {
            return dummy;
        } else {
            return dummy.next;
        }
    }
}
