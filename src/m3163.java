public class m3163 {
    public static String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        char[] arr = word.toCharArray();
        char target = word.charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // 判斷先前的數字是否要加到結果中
            if (count == 9 || target != arr[i]) {
                str.append(count);
                str.append(target);
                count=0;
                target = arr[i];
            }
            if (target == arr[i]) {
                count++;
            }
            // 最後一個，加到結果中
            if(i == arr.length - 1){
                str.append(count);
                str.append(target);
            }

        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("abcde"));
        System.out.println(compressedString("aaaaaaaaaaaaaabb"));
        System.out.println(compressedString("uuuuuuuuuuccccccvvvvvvvyyyyyyyylyyyqqqqqqqqqoaqqqq"));
    }
}
