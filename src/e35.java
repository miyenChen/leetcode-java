public class e35 {
    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] || (nums[i] > target && nums[i - 1] < target)) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}
