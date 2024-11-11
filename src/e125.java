public class e125 {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        // List<Character> number = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }

            // 原本寫法，看解答才發現 isLetterOrDigit 方法
            // int n = ch - 'a';
            // if (number.contains(ch) ||n >= 0 && n < 26) {
            //     str.append(ch);
            // }
        }


        if (str.toString().equals(str.reverse().toString())) return true;
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0s"));
    }
}
