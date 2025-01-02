package learn.oop2;

import learn.oop.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);

        treeSet.forEach(item -> System.out.println(item));
    }
}
