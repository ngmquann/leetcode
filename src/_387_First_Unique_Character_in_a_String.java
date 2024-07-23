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

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
