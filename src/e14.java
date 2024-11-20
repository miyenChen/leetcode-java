public class e14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int length = Integer.MAX_VALUE;
        for (String s : strs) {
            length = Math.min(length, s.length());
        }
        for (int i = 0; i < length; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
