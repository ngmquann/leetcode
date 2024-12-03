package learn;

public class MyLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void printList(Node head){
        if(head == null){
            System.out.println("Node is null");
        }

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static Node addToHead(Node head, int data) {
        Node newNode = new Node(data);
        if(head != null) newNode.next = head;
        return newNode;
    }

    public static Node addToTail(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) return newNode;

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

        return head;
    }

    public static Node addToIndex(Node head, int value, int index){
        if(index == 0) return addToHead(head, value);
        else {
            Node newNode = new Node(value);
            Node curNode = head;
            int cnt = 0;
            while (curNode != null) {
                cnt++;
                if(cnt == index){
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return head;
    }

    public static Node removeNodeHead(Node head){
        if(head == null) return null;
        return head.next;
    }

    public static Node removeNodeTail(Node head){
        if(head == null) return null;

        Node lastNode = head;
        Node preNode = null;

        while(lastNode.next != null){
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        if(preNode == null) return null;
        else {
            preNode.next = preNode.next.next;
        }

        return head;
    }

    public static Node removeNode(Node head, int index){
        if(head == null || index < 0) return null;
        if(index == 0) return removeNodeHead(head);

        Node curNode = head;
        Node preNode = null;
        int cnt = 0;
        while (curNode != null) {
            if(cnt == index){
                preNode.next = curNode.next;
                break;
            }
            preNode = curNode;
            curNode = curNode.next;
            cnt++;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printList(node1);
        System.out.println();

//        node1 = addToHead(node1, 0);
//        System.out.println();
//        printList(node1);
//
//        node1 = addToTail(node1, 5);
//        printList(node1);
//        System.out.println();

//        node1 = addToIndex(node1, 6, 4);
//        printList(node1);
//
//        System.out.println();
//
//        node1 = addToIndex(node1, 5, 4);
//        printList(node1);
//
//        System.out.println();
//
//        node1 = addToIndex(node1, 8, 0);
//        printList(node1);

//        node1 = removeNodeHead(node1);
//        printList(node1);

//        node1 = removeNodeTail(node1);
//        printList(node1);

        node1 = removeNode(node1, 0);
        printList(node1);
        System.out.println();

        node1 = removeNode(node1, 1);
        printList(node1);
        System.out.println();
    }
}
