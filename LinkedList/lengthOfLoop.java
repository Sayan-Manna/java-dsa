package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLoop {

    private static int lengthOfLoop(ListNode head) {
        // Floyd's Cycle Detection Algorithm ------------ O(N) | O(1)
        /*
        - Use two pointers, slow and fast.
        - Move slow pointer one step at a time and fast pointer two steps at a time.
        - If they meet, there is a loop.
            - call a function to find the length of the loop.
         ---
         countLength
        - Initialize a counter to 1.
        - move fast pointer one step at a time until it meets the slow pointer again. but 1st make it one step ahead as I have made counter to 1
        - Increment the counter for each step.
         */
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected
                return countLength(slow, fast);
            }
        }
        return 0;

        // Brute force approach ---------------- O(N) | O(N)
        /*
        - Map <Node, Integer> visited
        - timer -> Initialize timer to tract visited nodes -> think like indices first -> starting idx then current Idx
        - Traverse the linked list and store each node in the map with its corresponding timer value.
            - if we encounter a node that is already in the map, we have found a loop.
            - Calculate the length of the loop by subtracting the timer value of the first occurrence of the node from the current timer value.
            - Return the length of the loop.
         */

//        Map<ListNode, Integer> visited = new HashMap<>();
//
//        ListNode temp = head;
//        int timer = 0;
//        while (temp != null) {
//            if (visited.containsKey(temp)) {
//                // calc length of loop
//                int count = timer - visited.get(temp);
//                return count;
//            }
//            visited.put(temp, timer);
//            temp = temp.next;
//            timer++;
//        }
//        return 0;



    }
    private static int countLength(ListNode slow, ListNode fast) {
        int count = 1;
        fast = fast.next; // Move fast one step ahead

        while (slow != fast) {
            count++;
            fast = fast.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a linked list with a loop
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // This creates a loop
        fifth.next = second;

        int loopLength = lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
