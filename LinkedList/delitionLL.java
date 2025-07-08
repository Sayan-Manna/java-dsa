package LinkedList;

public class delitionLL {
    static void Display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
     static ListNode InsertAtHead(int value, ListNode head) {
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

     static ListNode DeleteAtBeginning(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = head;
        head = head.next;
        return head;
    }


    private static void DeleteAtEnd(ListNode head) {
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    private static void DeleteAtPos(ListNode head, int pos) {
        ListNode temp = head;
        pos--;
        while (pos != 1) {
            temp = temp.next;
            pos--;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head=InsertAtHead(20, head);
        head=InsertAtHead(30, head);
        head = InsertAtHead(40, head);
        head = InsertAtHead(50, head);
        head = InsertAtHead(60, head);
        head = InsertAtHead(70, head);
        DeleteAtPos(head, 3); // 50 removed
        Display(head);
        System.out.println();
        head = DeleteAtBeginning(head); // 70 removed
        DeleteAtEnd(head); // 10 removed
        Display(head);
    }
}
