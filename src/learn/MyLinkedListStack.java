package learn;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue{
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node headNode;

    MyLinkedListStack(){
        headNode = null;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            Node newNode = new Node(value);
            newNode.next = headNode;
            headNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(isEmpty()) return -1;

        int value = headNode.value;
        headNode = headNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null;
    }

    @Override
    public void print() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = headNode;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.value);
            temp = temp.next;
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
}
