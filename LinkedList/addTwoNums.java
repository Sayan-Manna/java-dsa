package LinkedList;
// Leetcode - 2
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros
/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

 */
public class addTwoNums {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};
        ListNode list1 = new ListNode(l1[0]);
        ListNode list2 = new ListNode(l2[0]);
        list1.next = new ListNode(l1[1]);
        list1.next.next = new ListNode(l1[2]);
        list2.next = new ListNode(l2[1]);
        list2.next.next = new ListNode(l2[2]);
        ListNode result = addTwoNumbers(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null || temp2 != null || carry > 0) {
            int sum = 0;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            /*
            if not using dummy node
            ListNode head = null;
            ListNode current = null;
            ...
                if (head == null) {
                    head = newNode;
                    current = head;
                } else {
                    current.next = newNode;
                    current = current.next;
                }
            }

             */
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;
    }
}
