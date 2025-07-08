package LinkedList;

public class searchElement {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3
        int[] arr = {1, 2, 3};
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);

        int val = 3;  // Element to be checked for presence in the linked list

        System.out.print(checkifPresent(head, val));
    }

    private static boolean checkifPresent(ListNode head, int val) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;

    }
}
