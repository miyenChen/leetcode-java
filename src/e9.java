public class e9 {
    public static boolean isPalindrome(int x) {
        int lastN = 0;
        int revN = 0;
        int c = x; // 拷貝最初值，最後和倒轉的數字對比

        // 負數不能回文，所以只須處理正數
        while (x > 0) {
            // 取得當前最後一位數
            lastN = x % 10;

            // 把倒轉值進位，再加上剛取得的個位數
            revN = revN * 10;
            revN = revN + lastN;

            // 移除個位數
            x = x / 10;
        }

        if (c == revN) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
