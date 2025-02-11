public class m1910 {
    public static String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        int length = part.length();
        char last = part.charAt(part.length() - 1);

        for (char ch : s.toCharArray()) {
            str.append(ch);
            if (ch == last &&
                    str.length() >= length &&
                    str.substring(str.length() - length, str.length()).equals(part)
            ) {
                str.delete(str.length() - length, str.length());
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc")); // dab
        System.out.println(removeOccurrences("axxxxyyyyb", "xy")); // ab
        System.out.println(removeOccurrences("ccctltctlltlb", "ctl")); // b
        System.out.println(removeOccurrences("gjzgbpggjzgbpgsvpwdk", "gjzgbpg")); // b
    }
}

/*
用stack概念執行，當最後一個字符合時，才往前抓出子字串
頭尾字母可能相同，所以加上字長判斷，避免一開始就進入判斷
*/