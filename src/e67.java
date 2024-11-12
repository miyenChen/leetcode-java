public class e67 {
    public static String addBinary(String a, String b) {
        // 從後往前，a b 長度不同，所以要分開計數
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int count = carry;
            if (i >= 0) {
                count += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                count += b.charAt(j) - '0';
                j--;
            }

            res.append(count % 2);
            carry = count / 2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}


