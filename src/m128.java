import java.util.Arrays;

public class m128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (nums[i] == nums[i - 1]) {
                // 數字重複，跳過
                continue;
            } else {
                // 數字不連貫，重新記數
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        // System.out.println(longestConsecutive(new int[]{889, 3, 888, 0, 444, 887, 45, 886, 4, 0}));
        System.out.println(longestConsecutive(new int[]{1, 2, 0, 1}));
    }
}
