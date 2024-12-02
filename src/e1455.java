public class e1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" "); //把單字拆到array中
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].startsWith(searchWord)) { //比對前綴
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("pillow love winstontang i pillow corona you errichto love", "i"));
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("i am tired", "you"));
    }
}
