package StackAndQueue.Impl;

public class StackImplUsingLL {
    public static void main(String[] args) {
        StackImpls.LinkedListStack s = new StackImpls.LinkedListStack();
        s.stackPush(10);
        s.stackPush(20);
        s.printStack();
        System.out.println("Element popped " + s.stackPop());
        System.out.println("Stack size: " + s.stackSize());
        System.out.println("Stack is empty or not: " + s.isStackEmpty());
    }

}