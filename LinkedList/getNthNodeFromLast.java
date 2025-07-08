package LinkedList;


public class getNthNodeFromLast {
    private static void getNth(ListNode head, int n) {
        // Using Two Pointer : R(1x upto N) -then-> R(1x), L(1x) w/o using Dummy Node
        if (head == null) return;
        ListNode slow = head;
        ListNode fast = head;

        // 1st traverse the fast pointer till n
        for (int i=0; i<n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            System.out.println(head.val);
            return; // if n is equal to length of linked list
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.next.val);


////        // Using Two Pointer : R(1x upto N) -then-> R(1x), L(1x) ---------|
////        // Using Dummy Node : O(n) | O(n)
////        // Proof :
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        // Create two pointers slow and fast, both pointing to the dummy node
//        ListNode slow = dummy;
//        ListNode fast = dummy;
//        // 1st traverse the fast pointer till n
//        for (int i=0; i <n; i++) {
//            fast = fast.next;
//        }
//        // fast will never be null as I am traversing till n
//        // In case of last node, i.e. if n == length of LL, then we will just return the head which is
//        // dummy.next.val, here slow.next.val
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        System.out.println(slow.next.val);

//        // By finding the length : O(n) | O(1) ------------|
//         int len = 0;
//         // traverse the linked list to find the length
//         for (ListNode first=head; first != null; first=first.next) {
//             len += 1;
//         }
//            // if n is greater than length of linked list
//         if (len < n) return;
//
//         ListNode temp = head;
//         // traverse till (len-n) because we need to find the nth node from the end
//         for (int i=0; i<len-n; i++) {
//             temp = temp.next;
//         }
//         System.out.println(temp.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10); // d -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        getNth(head, 4);
        
    }
}
