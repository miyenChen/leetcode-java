import java.util.Arrays;

public class e283 {
    public static int[] moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[n] = nums[i];
                n++;
            }
        }
        while(n<nums.length){
            nums[n]=0;
            n++;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }
}
