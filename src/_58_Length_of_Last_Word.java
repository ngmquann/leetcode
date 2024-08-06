public class _58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int cnt = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                cnt++;
                if (i - 1 < 0 || s.charAt(i-1) == ' '){
                    break;
                }
            }
            i--;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
