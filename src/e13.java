import java.util.HashMap;

public class e13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map =new HashMap<>() ;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=0;

        for (int i = 0; i < s.length(); i++) {
            char  str=s.charAt(i);
            int value=map.get(str);
            // 假如下一個值比目前大，代表此數字為 4 或 9 的倍數，則本次值為負 => 例如 -10+100 => 90
            if(i<s.length()-1&&value<map.get(s.charAt(i+1))){
                ans-=value;
            }else {
                ans+=value;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
