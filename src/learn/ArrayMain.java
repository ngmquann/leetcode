package learn;

public class ArrayMain {
    public static void main(String[] args) {
//        MyArrayStack myArrayStack = new MyArrayStack(3);
//        myArrayStack.push(1);
//        myArrayStack.push(2);
//        myArrayStack.push(3);
//        myArrayStack.print();
//
//        myArrayStack.pop();
//        myArrayStack.print();

//        MyArrayQueue myArrayQueue = new MyArrayQueue(3);
//        System.out.println(myArrayQueue.push(1));
//        System.out.println(myArrayQueue.push(2));
//        System.out.println(myArrayQueue.push(3));
//        System.out.println(myArrayQueue.push(4));
//        myArrayQueue.print();
//
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.print();
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.print();
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.print();
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.print();

        MyLinkedListStack myLinkedListStack = new MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        myLinkedListStack.print();

        System.out.println(myLinkedListStack.pop());
        myLinkedListStack.print();
        System.out.println(myLinkedListStack.pop());
        myLinkedListStack.print();
        System.out.println(myLinkedListStack.pop());
        myLinkedListStack.print();
        System.out.println(myLinkedListStack.pop());
        myLinkedListStack.print();
    }
}
