package LinkedList;

public class detectCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle **

        System.out.println(hasCycle(head)); // Output: true
    }

    private static boolean hasCycle(ListNode head) {
        // Optimal
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected

    }
}
