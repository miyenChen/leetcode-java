import java.util.Arrays;

public class m567 {
    public static boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c:s1.toCharArray()){
            arr1[c-'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
            if(i>=length){
                arr2[s2.charAt(i-length) - 'a']--;
            }
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbyaooo"));
    }
}
