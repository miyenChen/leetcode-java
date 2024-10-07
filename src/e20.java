import java.util.HashMap;
import java.util.Stack;

public class e20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        HashMap<Character, Character> strMap = new HashMap<>();
        strMap.put('(', ')');
        strMap.put('[', ']');
        strMap.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (strMap.containsKey(current)) {
                // 開括號，放到堆中
                stack.push(current);
            } else {
                // 閉括號
                if (stack.isEmpty()) return false;

                char openBracket = stack.pop();
                if (strMap.get(openBracket) != current) return false;
            }

        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("[]([])"));
        System.out.println(isValid("("));
        System.out.println(isValid("){"));
        System.out.println(isValid(")("));
        System.out.println(isValid("(("));

    }
}
