public class m2109 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < spaces.length; i++) {
            if (i == 0) {
                str.append(s.substring(0, spaces[0]));
            } else {
                str.append(" " + s.substring(spaces[i - 1], spaces[i]));
            }
        }
        str.append(" " + s.substring(spaces[spaces.length - 1], s.length())); //最後一個單字
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(addSpaces("icodeinpython", new int[]{1, 5, 7, 9}));
    }
}
