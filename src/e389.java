public class e389 {
    public static char findTheDifference(String s, String t) {
        int xor=0;
        // 將 s 和 t 的所有值進行 xor 計算
        for(int i=0;i<t.length();i++){
            // 添加s值，t的字串長度較大，所以要限制條件
            if(i < s.length()){
                xor^=s.charAt(i);
            }
            // 添加t值
            xor^=t.charAt(i);
        }
        // 由於一開始是 int 類型，所以需要強制轉換
        return (char)xor;
    }
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findTheDifference("abed","bceda"));
        System.out.println(findTheDifference("",""));


        // System.out.println(0^'e'); // 101 => 0^101 = 101
        // System.out.println(101^'e'); // 0 => 101^101 = 0
        // System.out.println('e'^'e'); // 0 => 101^101 = 0
        // System.out.println('E'^'e'); // 32
        System.out.println('a'^'b');
    }
}
