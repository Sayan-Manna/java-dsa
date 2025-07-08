package LinkedList;
// Leetcode - 203
// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
public class removeElements {
    private static ListNode deleteAllNum(ListNode head, int val) {
        
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10); // 10->20->30->40->30->30->null
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(30);
        head.next.next.next.next.next = new ListNode(30);
        int n = 30;
        ListNode temp = deleteAllNum(head, n);
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
