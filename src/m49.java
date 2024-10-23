import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class m49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);

            // 如果沒有 newStr 對應數組，建立新數組
            if (!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<>()); // 如果沒有這個鍵，就新建一個 List
            }
            // 找到 newStr 對應的數組後添加
            map.get(newStr).add(s);
        }

        // map.values()會得到所有 value 的集合，ArrayList 再轉換成 return 需要的類型
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{}));
    }
}
