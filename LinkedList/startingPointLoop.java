package LinkedList;

public class startingPointLoop {
    public static void main(String[] args) {
        // Create a linked list with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; // Creating a loop

        ListNode loopStartListNode = findLoopStart(head);
        if (loopStartListNode != null) {
            System.out.println("Loop starts at ListNode with value: " + loopStartListNode.val);
        } else {
            System.out.println("No loop detected.");
        }
    }

    private static ListNode findLoopStart(ListNode head) {
        // Floyd's Cycle Detection Algorithm ---- O(N) | O(1)
        /*
        - Use two pointers (slow and fast)
        - Move slow by 1 step and fast by 2 steps
        - If they meet, there is a loop
        - Move slow to head and keep fast at meeting point
        - Move both one step at a time
        - The point where they meet again is the starting point of the loop
        - If fast reaches null, there is no loop
         */
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                slow = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow; // Starting point of the loop
            }
        }
        return null;

        // Brute-force ---- O(N) | O(N)
        /*
        - Same like detect a loop
        - Only that we need to return the node itself instead of boolean
        - HashMap<ListNode, Integer> to store the node and its frequency
        - return the temp node when the frequency is > 1
         */
    }
}
