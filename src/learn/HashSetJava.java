package learn;

import java.util.HashSet;
import java.util.Set;

public class HashSetJava {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        mySet.add("1");
        mySet.add("2");

        for (String s : mySet) {
            System.out.println(s);
        }
    }
}
