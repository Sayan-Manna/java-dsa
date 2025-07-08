package LinkedList;

public class DNode {
    public int val;
    public DNode next;
    public DNode prev;

    public DNode(int val, DNode next, DNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public DNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
