import java.util.Arrays;

public class m189 {
    public static int[] rotate(int[] nums, int k) {
        if (nums.length == 1) return nums;
        int[] arr = Arrays.copyOf(nums, nums.length);
        for (int i = nums.length - 1; i >= 0; i--) {
            int move = i + k;
            while (move >= nums.length) {
                move -= nums.length;
            }
            nums[move] = arr[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{-1, -100, 3, 99}, 2)));
        System.out.println(Arrays.toString(rotate(new int[]{-1}, 3)));
    }
}
/*
6+3 =>9
9-7=>2

3+3=>6

4+3=>7
7-7=>0

0+3=>2
3-1=1
 */



