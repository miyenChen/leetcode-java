public class m443 {
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            System.out.println(chars);
            return 1;
        }
        char cur = chars[0];
        int count = 0;
        int index = 0;


        for (int i = 0; i < chars.length; i++) {
            count++;

            // 若下一個字不同或到了最後一個字，更新資料
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                chars[index++] = cur;

                // 單個數量的不用放數字，其他更新數字
                if (count > 1) {
                    for (char digit : String.valueOf(count).toCharArray()) {
                        chars[index++] = digit;
                    }
                }

                //將cur指向新的字
                if (i < chars.length - 1) {
                    cur = chars[i + 1];
                }
                count = 0;
            }
        }

        // 最後把多餘的元素設為null
        for (int i = index; i < chars.length; i++) {
            chars[i] = '\0'; // Clear remaining elements
        }
        System.out.println(chars);
        return index;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println("----------");
        System.out.println(compress(new char[]{'a', 'b', 'c'}));
        System.out.println("----------");
        System.out.println(compress(new char[]{'a'}));
        System.out.println("----------");
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a', 'a', 'b'}));
    }
}


