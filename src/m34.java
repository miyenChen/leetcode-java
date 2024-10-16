import java.util.Arrays;

public class m34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int tIndex = -1;

        // 先用二分搜尋法找到其中一個 target
        while (left <= right) {
            int midIndex = (right - left) / 2 + left;
            if (nums[midIndex] == target) {
                tIndex = midIndex;
                break;
            } else if (nums[midIndex] > target) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }

        // 如果沒有任何 target
        if (tIndex == -1) {
            return ans;
        }

        // 確認 target 值所在的範圍
        // 可能多於一個，所以要從找到的索引往左右擴張檢查
        left = tIndex;
        right = tIndex;

        // 向左擴展
        // 要注意檢查順序，如果 left == -1 ，不應該往後檢查 nums[left]
        while (left >= 0 && nums[left] == target) {
            left--;
        }
        ans[0] = left + 1;


        // 向右擴展
        // 要注意檢查順序，如果超出 nums 範圍，不應該執行檢查 nums[right]的值，會引發IndexOutOfBoundsException問題
        while (right < nums.length && nums[right] == target) {
            right++;
        }
        ans[1] = right - 1; // 最右邊的索引是 right - 1

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // [-1, -1]
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10))); // [5, 5]
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 8, 10}, 8))); // [3, 5]


    }
}
