package learn.oop;

public class Child extends Parent{
    void print(String text){
        System.out.println(text);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
