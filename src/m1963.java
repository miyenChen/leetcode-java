public class m1963 {
    public static int minSwaps(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                count++;
            } else if (count > 0) {
                // ch == ']'，並且有未配對的開括號時
                count--;
            }
        }
        // 剩下未配對的組數量，由於剩奇數組時也要交換一次，所以要先+1
        return (count + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minSwaps("][]["));
        System.out.println(minSwaps("]]][[["));
        System.out.println(minSwaps("[]"));
        System.out.println(minSwaps("]]]]]][[[[[["));
        System.out.println(minSwaps("]]][[]]][[[["));
    }
}

// "]]]]]][[[[[[" 共六對
// "[] ]]]] [] [[[["0=>7 修復2對
// "[[ ]]]] [] [] [["1=>8 修復2對
// "[[[ ]]] [] [] []"2=>11 修復2對

// "]]] [[]] ][[[[" 共六對，已有2對
// "[]] [[]] ][] [["0=>9 修復2對
// "[[] [[]] ][] []"1=>11 修復2對





