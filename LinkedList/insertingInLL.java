package LinkedList;

public class insertingInLL {
    static void Display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
     static ListNode InsertFirst(int value, ListNode head) {
        // new node to be added -> create that node
        ListNode newNode = new ListNode(value);
        if (head == null){ 
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void InsertAtLast(int value, ListNode head) {
        // Node created
        ListNode newNode = new ListNode(value);
        newNode.val = value;
        newNode.next = null;
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }
    static void InsertAtPosition(int value, ListNode head, int pos) {
        ListNode newNode = new ListNode(value);
        ListNode headRef = head;
        pos--;
        while (pos != 1) {
            headRef = headRef.next;
            pos--;
        }
        newNode.next = headRef.next;
        headRef.next = newNode;
    }

    public static void main(String[] args) {
        ListNode head = null; // head initialization
//        head = InsertFirst(40, head);
//        head = InsertFirst(30, head);
//        head = InsertFirst(20, head);
        head = new ListNode(20);
        head.next = new ListNode(30);
        head.next.next = new ListNode(40);
        // Insert at first returning the head or 1st node of LL
        /*
        // for insertAtFirst
        •	❗ Here’s the catch: you’re trying to update the head itself (head = newNode)
	    •	But head is a local copy of the reference — so this update stays only inside the function
	    •	Main method’s head stays unchanged.
        ❌ Doesn’t work unless you return the new head and assign it:
         */
        head = InsertFirst(10, head); // pass by value: so copy of head is passed, so to change the actual head, we need to return the new head and store here

        /*
        InsertAtLast() and InsertAtPosition() don’t change the head reference,
        they only modify the nodes that head points to — so changes reflect in the original list.
        But InsertFirst() changes the head itself, and since head is passed by value,
        the caller (main) doesn’t get the updated head unless you return it.


         */
        /*
        •	You’re not replacing head; you’re just doing head.next = newNode;
	    •	That affects the actual linked list, because you’re modifying the node fields, not the reference itself.
         */
        InsertAtLast(50, head);
        InsertAtLast(60, head);
        /*
        •	Same story: You’re going into the middle of the list and adjusting .next pointers.
	    •	Again, you’re not changing the reference to the head, just its internals.
         */
        InsertAtPosition(15, head, 3);

        Display(head);
    }
}
