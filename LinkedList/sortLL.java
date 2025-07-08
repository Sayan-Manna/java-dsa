package LinkedList;

public class sortLL {

    private static void sortLinkedList(ListNode head) {
        // Merge Sort -----------| O(nlogn) | O(N)




        // Brute-force -----------| O(nlogn) | O(N)
        /*
        - Take a list of all the elements in the linked list
        - Sort the list
        - Traverse the linked list again via list traversal and replace the values with the sorted list
         */
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(2);

//        head = sortLinkedList(head);

        // Print the sorted linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }


}
