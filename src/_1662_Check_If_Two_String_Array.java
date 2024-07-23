public class _1662_Check_If_Two_String_Array {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }

        for (String word : word2) {
            s2.append(word);
        }
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"hello", " leetcode"};
        String[] word2 = {"he", "llo leetcode"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
