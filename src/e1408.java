import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e1408 {
    public static List<String> stringMatching(String[] words) {
        List<String> resault = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String addStr;
                if (words[i].length() > words[j].length()) {
                    addStr = checkMatch(words[i], words[j]);

                } else {
                    addStr = checkMatch(words[j], words[i]);

                }
                if (!set.contains(addStr) && addStr.length() > 0) {
                    resault.add(addStr);
                    set.add(addStr);
                }
            }
        }
        return resault;
    }

    private static String checkMatch(String longStr, String shortStr) {
        int check = longStr.indexOf(shortStr);
        if (check != -1) {
            return shortStr;
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        System.out.println(stringMatching(new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"}));
    }
}