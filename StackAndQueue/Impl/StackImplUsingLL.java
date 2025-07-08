package StackAndQueue.Impl;

public class StackImplUsingLL {

}
class stack {
    // creating the stack node
    private class stackNode {
        int val;
        stackNode next;
        stackNode(int d) {
            val = d;
            next = null;
        }
    }
    stackNode top;
    int size;

    stack() {
        this.top = null;
        this.size = 0;
    }

    void stackPush(int x) {
        stackNode elemNode = new stackNode(x);
        elemNode.next = top; // structure top -> [2] -> [1] -> null
        top = elemNode;
        System.out.println("pushed");
        size++;
    }
    int stackPop() {

    }

}