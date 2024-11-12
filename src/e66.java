import java.util.Arrays;

public class e66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // 一般狀況 或 如果上一個值是9，本次等於進位
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 如果是 9 則進位
            digits[i] = 0;

        }

        // {9,9} {9,9,9} 的狀況，進位需要多一位數
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 5, 9})));
    }

}
