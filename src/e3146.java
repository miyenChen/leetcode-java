public class e3146 {
    public static int findPermutationDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            // 取得 s 的字元在 t 字串中的位置
            char str = s.charAt(i);
            int tIndex = t.indexOf(str);

            // 計算 t-s 索引的絕對值，並累計
            ans += Math.abs(tIndex - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc","bac"));
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }
}
