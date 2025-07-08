package LinkedList;
// how to access head => list.head.val / list.head.next as head is static
// as head static => no need to put it as an argument in function, No need to create Reverse() object
public class Reverse {
    static ListNode head; // static
    // reverse iterative  o(N) | O(1)----------------
    static ListNode ReverseLL(ListNode head) {
       ListNode temp = head;
       ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next; // store next node
            temp.next = prev; // reverse the link
            prev = temp; // move prev to current node
            temp = front; // move to next node
        }
        return prev; // new head
    }
    // reverse using stack | O(N) | O(N) ----------------------
    static ListNode ReverseUsingStack() {
        java.util.Stack<Integer> st = new java.util.Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }
    // printing reverse recursively -------------------
    static void RecursiveReverse(ListNode head) {
        ListNode temp = head;
        if (head == null) return;
        RecursiveReverse(temp.next);
        System.out.print(temp.val+" ");
    }
    static void InsertAtTail(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        newNode.next = null;
        ListNode last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
    }
    static void Display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
//        Reverse list = new Reverse();
        InsertAtTail(10);
        InsertAtTail(20);
        InsertAtTail(30);
//        list.head = new ListNode(10);
//        list.head.next = new ListNode(20);
//        list.head.next.next = new ListNode(30);
        Display();
        RecursiveReverse(head); // printing reverse recursively
        head = ReverseLL(head); // actual reverse Iterative
        System.out.println();
        Display();
        head = ReverseUsingStack(); // reverse using stack
        Display();
    }
}
