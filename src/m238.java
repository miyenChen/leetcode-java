import java.util.Arrays;

public class m238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zero = 0;
        int max = 1;

        // 計算除了0的總乘積
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                max *= nums[i];
            }
        }

        if (zero > 1) {
            Arrays.fill(ans, 0);
        } else if (zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    ans[i] = max;
                } else {
                    ans[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = max / nums[i];
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
