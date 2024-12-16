package learn;

public class MyArrayStack implements IStackQueue{
    private int[] array;
    private int SIZE;
    private int topIndex;

    MyArrayStack(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }
    @Override
    public boolean push(int value) {
        if(!isFull()){
            array[++topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            topIndex--;
            return array[topIndex];
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
