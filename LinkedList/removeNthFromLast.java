package LinkedList;

public class removeNthFromLast {
    private static ListNode removeNth(ListNode head, int n) {
        // Using Two Pointer : R(1x upto N) -then-> R(1x), L(1x)
        ListNode slow = head;
        ListNode fast = head;
        // 1st traverse the fast pointer till n
        for (int i=0; i<n; i++) {
            fast = fast.next;
        }
        // if fast becomes null or n == length of LL
        // Then it'll be 1st node itself
        if (fast == null) {
            head = head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

        // By finding the length : O(n)+O(n) = O(2n)
        // int len = 0;
        // for (ListNode first=head; first != null; first=first.next) {
        //     len += 1;
        // }
        // if (len < n) return null;
        // // remove 1st node
        // if (len == n) {
        //     head = head.next;
        // }
        // ListNode temp = head;
        // // traverse till (len-n)
        // for (int i=1; i<len-n; i++) { // 5 - 2
        //     temp = temp.next;
        // }
        // // ListNode Nth = temp.next; // the node to be removed
        // temp.next = temp.next.next;
        // return head;
        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10); // 10 -> 20 -> 30 -> 40 -> 50 -> null
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        ListNode temp = removeNth(head, 5);
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    
}
