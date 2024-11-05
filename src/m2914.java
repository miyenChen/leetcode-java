public class m2914 {
    public static int minChanges(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i+=2) {
            if (s.charAt(i-1) != s.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minChanges("101011000001"));
    }
}

// Hint 1 每兩個一組的數字相同為 'beautiful'