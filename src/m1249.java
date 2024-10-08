public class m1249 {
    public static String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // 所有開括號
                open++;
                res.append(ch);
            } else if (ch == ')') {
                // 有找到開括號，才加入到字串中
                if (open > 0) {
                    open--;
                    res.append(ch);
                }
            } else {
                // 除了 ( ) 以外的字符
                res.append(ch);

            }
        }

        // 反向迴圈，可以避免刪除元素時，造成的長度變動錯誤
        for (int i = res.length() - 1; i >= 0; i--) {
            if (open > 0) {
                if (res.charAt(i) == '(') {
                    res.deleteCharAt(i);
                    open--;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(minRemoveToMakeValid("a)b(c)d"));
        System.out.println(minRemoveToMakeValid("))(((("));
        System.out.println(minRemoveToMakeValid("(a(b(c)d)"));
    }
}
