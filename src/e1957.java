public class e1957 {
    public static String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        char cur = s.charAt(0);
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == cur) {
                count++;
            }else{
                count=1;
                cur=ch;
            }
            if (count <= 2 ) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaaaaaaanaaannn"));
    }
}

/* note
注意這邊如果用 String 並用 str += ch 的方式
會導致每一次迴圈都創建新的 string 物件，造成大量輸入時花費更多時間和空間
 */
