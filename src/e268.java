public class e268 {
    public static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for(int n:nums){
            sum-=n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }
}
