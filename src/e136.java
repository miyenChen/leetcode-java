public class e136 {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        // 把所有數字 xor
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }

    public static void main(String[] args) {
        // System.out.println(singleNumber(new int[]{2, 2, 1}));
        // System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        // System.out.println(singleNumber(new int[]{1}));
        // System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2, 4, 5, 3, 5}));
        System.out.println(0^'e'); // 101
        System.out.println(101^'e'); // 0
        System.out.println('e'^'e'); // 0
        System.out.println('E'^'e'); // 32
        System.out.println('l'^'e'); // 9
    }
}

/* xor特性
 *  與自己運算結果為 0 => 4 ^ 4 = 0
 *  與零運算結果為自身 => 4 ^ 0 = 4
 *  若都是xor計算，則數字順序不影響計算結果: 4 ^ 1 ^ 4 =  4 ^ 4 ^ 1 => 0 ^ 1 => 1
 */
