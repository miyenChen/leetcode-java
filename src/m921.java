import java.util.Stack;

public class m921 {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || stack.isEmpty()) {
                stack.push(ch);
            } else {
                // 閉括號
                char el = stack.peek();
                if (el == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("())(()"));
        System.out.println(minAddToMakeValid("()()"));
    }
}
