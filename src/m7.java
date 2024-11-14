public class m7 {
    public static int reverse(int x) {
        if (x == 0) return 0;
        long res = 0;

        while (x != 0) {
            int digit = x % 10;
            res = res * 10 + digit;
            x = x / 10;

            // 翻轉後可能超出範圍
            if (res > Integer.MAX_VALUE||res<Integer.MIN_VALUE) return 0;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-103));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483648));
    }
}
