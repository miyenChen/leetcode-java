public class e345 {
    public static String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && vowels.indexOf(s.charAt(start)) < 0) {
                start++;
            }
            while (start < end && vowels.indexOf(s.charAt(end)) < 0) {
                end--;
            }

            if (start < end) {
                str.setCharAt(start, s.charAt(end));
                str.setCharAt(end, s.charAt(start));
                start++;
                end--;
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels(".,"));
    }
}
