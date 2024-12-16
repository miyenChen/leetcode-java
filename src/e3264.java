import java.util.Arrays;

public class e3264 {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int index = 0;
            int n = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < n) {
                    n = nums[j];
                    index = j;
                }
            }
            nums[index] = n* multiplier;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
    }
}
