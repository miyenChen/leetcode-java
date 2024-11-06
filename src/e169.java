import java.util.Arrays;

public class e169 {
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int index=nums.length/2;
        //
        // return nums[index];


        // 學 Boyer-Moore 投票算法
        int n = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                n = nums[i];
                count=1;
            } else if (nums[i] == n) {
                count++;
            } else {
                count--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 2, 1, 1, 2, 3, 3}));
    }
}
