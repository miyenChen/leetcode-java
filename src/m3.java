import java.util.HashSet;
import java.util.Set;

public class m3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max=0;

        while (r < s.length()) {

            // 如果當前 r 對應的字符在 set 中，移除 l 對應的字符，並右移左指標 l
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            // 將 r 對應的字符加入 set 中
            set.add(s.charAt(r));
            r++;

            // 更新最大長度
            max = Math.max(max, r - l);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

/*
(p)wwkew => 1
(pw)wkew => 2
(pww)kew => NO
p(ww)kew => NO
pw(w)kew => NO
pw(wk)ew => 2
pw(wke)w => 3
pw(wkew) => NO
pww(kew) => 3
pwwk(ew) => 2
pwwke(w) => 1

*/