package learn;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            if(map.containsKey(i) == false){
                map.put(i,1);
            } else {
                int count = map.get(i) + 1;
                map.put(i,count);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
