import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int index = (int) c;
            count[index]++;
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int index = (int) c;
            if (count[index] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            if (map.containsKey(c) == false) {
                map.put(c, 1);
            } else {
               map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar2(s));
    }
}
