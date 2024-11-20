import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;

        int length = p.length();
        int[] arrP = new int[26];
        int[] arrS = new int[26];

        for (char c : p.toCharArray()) {
            int i = c - 'a';
            arrP[i]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a';
            arrS[cur]++;

            if (i >= length) {
                int n = s.charAt(i - length) - 'a';
                arrS[n]--;
            }

            if (Arrays.equals(arrP, arrS)) {
                res.add(i - length+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "acb"));
    }
}

/*
找到兩個相同數字，但距離<=K
*/
