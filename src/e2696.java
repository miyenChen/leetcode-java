import java.util.Stack;

public class e2696 {
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && ((ch == 'B' && stack.peek() == 'A') || (ch == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            } else {
                stack.push(ch);
            }


            // if (ch == 'B') {
            //     if (!stack.isEmpty() &&stack.peek() == 'A') {
            //         stack.pop();
            //     } else {
            //         stack.push(ch);
            //     }
            // } else if (ch == 'D') {
            //     if (!stack.isEmpty() &&stack.peek() == 'C') {
            //         stack.pop();
            //     } else {
            //         stack.push(ch);
            //     }
            // } else {
            //
            //     stack.push(ch);
            // }

        }
        return stack.size();
    }

    public static void main(String[] args) {

        System.out.println(minLength("ABFCACDB"));
        System.out.println(minLength("ACBBD"));
        System.out.println(minLength("A"));
        System.out.println(minLength("ACDBABD"));
    }
}
