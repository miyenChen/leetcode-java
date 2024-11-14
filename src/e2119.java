public class e2119 {
    public static boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        return num%10!=0;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
        System.out.println(isSameAfterReversals(1800));
        System.out.println(isSameAfterReversals(0));
    }
}
/*
個位數如果是0會導致翻轉後位數減少
所以除了0以外，大於0的數只要確認個位數
*/