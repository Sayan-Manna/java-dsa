package LinkedList;

import java.util.Stack;

import static LinkedList.Reverse.ReverseLL;

public class palindromeLL {
    private static boolean isLLPalindrome(ListNode head) {

        // Optimal Algorithm -------- O(n) time and O(1) space
        /*
        - Check if the linked list is empty or has only one node -> true
        - Use two pointers (slow and fast) to find the middle of the linked list.
        - Reverse the second half of the linked list starting from the middle.
        - Take two pointers (firstHalf and secondHalf) to compare the first half and the second half of the linked list.
        - If the values of the first half and the second half are equal, then it is a palindrome.
            - If not, -> restore the original LL -> return false.
        - Restore the original linked list by reversing the second half again. -> return true
         */

        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head,  fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = ReverseLL(slow.next);

        ListNode firstHalf = head;
        ListNode secondHalf = newHead;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                ReverseLL(newHead);
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        ReverseLL(newHead);
        return true;


        // Brute-force -------- O(n) time and O(n) space
        /*
        - Use a stack to store the values of the linked list.
        - make temp to head again -> Traverse again -> check if temp.val == stack.peek() then pop()-> if stack gets empty and traverse finishes, return true
        - Basically we are checking if the first half of the linked list is equal to the second half of the linked list.
         */
//        Stack<Integer> stack = new Stack<>();
//        ListNode temp = head;
//        while (temp != null) {
//            stack.push(temp.val);
//            temp = temp.next;
//        }
//        temp = head;
//        while (temp != null) {
//            if (temp.val != stack.peek()) {
//                return false;
//            }
//            stack.pop();
//            temp = temp.next;
//        }
//        return true;
    }





    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);


        // Check if the linked list is a palindrome
        if (isLLPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }


}
