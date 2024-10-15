public class m2938 {
    public static long minimumSteps(String s) {
        // int 長度是 32 位元，範圍是(-2^31 ~ 2^31-1)，也是 -2,147,483,648 ~ 2,147,483,647
        // 如果值超過範圍會循環到負數，造成整數溢位 (integer overflow)
        // int ans=0;

        long ans=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }else{
                ans+=one;
            }
        }
        return ans;
    }

    public static void  main(String[] args){
        System.out.println(minimumSteps("101")); //1
        System.out.println(minimumSteps("100")); //2
        System.out.println(minimumSteps("0111")); //0
        System.out.println(minimumSteps("101111110")); //8
        System.out.println(minimumSteps("10110001110")); //16
        
        // 10110001110 =>0
        // 01110001110 =>1
        // 00111001110 =>1+3
        // 00011101110 =>1+3+3
        // 00001111110 =>1+3+3+3
        // 00000111111 =>1+3+3+3+6=>16
    }
}