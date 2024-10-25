import java.util.ArrayList;
import java.util.List;

public class _1324_Print_Words_Vertically {
    public static List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] words = s.split(" ");

        int max = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
            }
        }

        for (int i = 0; i < max; i++) {
            String word = "";
            for(int j = 0; j < words.length; j++) {
                if(i >= words[j].length()) {
                    word += " ";
                } else {
                    word += words[j].charAt(i);
                }
            }

            while(word.charAt(word.length()-1) == ' '){
                word = word.substring(0, word.length()-1);
            }
            res.add(word);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "CONTEST IS COMING";
        List<String> res = printVertically(s);
        System.out.println(res);
    }
}
