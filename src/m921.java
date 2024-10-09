import java.util.Stack;

public class m921 {
    public static int minAddToMakeValid(String s) {
        // 使用stack方法
        // Stack<Character> stack = new Stack<>();
        //
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //
        //     if (ch == '(' || stack.isEmpty()) {
        //         stack.push(ch);
        //     } else {
        //         // 閉括號
        //         char el = stack.peek();
        //         if (el == '(') {
        //             stack.pop();
        //         } else {
        //             stack.push(ch);
        //         }
        //     }
        // }
        //
        // return stack.size();

        // 計算數量
        char[] charArr=s.toCharArray();
        int open=0;
        int close =0;
        for(char ch:charArr){
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else {
                    close++;
                }
            }
        }
        return open+close;
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("())(()"));
        System.out.println(minAddToMakeValid("()()"));
    }
}
