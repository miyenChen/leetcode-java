import java.util.HashMap;

public class m12 {
    public static String intToRoman(int num) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String ans = "";

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                ans += romanNumerals[i];
                num -= values[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
