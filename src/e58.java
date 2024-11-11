public class e58 {
    public static int lengthOfLastWord(String s) {
        // String[] strArr = s.split(" ");
        //
        // for(int i=strArr.length-1;i>=0;i--){
        //     if(strArr[i]!=" "){
        //         return strArr[i].length();
        //     }
        // }
        // return 0;


        //刪除頭尾空格
        s = s.trim();
        // 找到最後一個空白符的位置
        int lastSpaceIndex = s.lastIndexOf(' ');
        // 返回最後一個單詞的長度
        return s.length() - lastSpaceIndex - 1; //包含空格本身，所以要減一
    }
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
