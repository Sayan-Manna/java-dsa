package LinkedList;
// head won't be given, only the node that to be deleted
// will be given. It is guaranteed that the node to be deleted isn't the tail
public class deleteWOHead {
    private static void deleteGivenNode(ListNode head) {
        head.val = head.next.val; // copy the next node value to the given node
        head.next = head.next.next; // cut the pointer to the next-most node & join it with its next-most node
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40); // 10->20->30->40->null
        deleteGivenNode(head.next); // 10->30->30->40->null ==> 10->30->40->null
        while(head != null) {
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.print("null");
    }
}
