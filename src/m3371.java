import java.util.Arrays;

public class m3371 {
    public static int getLargestOutlier(int[] nums) {
        Arrays.sort(nums); //要找最大的，所以先排序
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int filterSum = sum - nums[i];
            if (filterSum % 2 == 0) { // 確保剩餘的和是偶數
                int target = filterSum / 2;
                // 使用二分搜尋，檢查是否有另一個數字等於 target
                if (binarySearch(nums, target, i)) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    private static boolean binarySearch(int[] nums, int target, int excludeIndex) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid == excludeIndex) { //如果跟 outlier 同 index 需要跳過
                if (target < nums[mid]) r = mid - 1;
                else l = mid + 1;
            } else if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getLargestOutlier(new int[]{2, 3, 5, 10}));
        System.out.println(getLargestOutlier(new int[]{-2, -1, -3, -6, 4}));
        System.out.println(getLargestOutlier(new int[]{1, 1, 1, 1, 1, 5, 5}));
    }
}


/*
100444. Identify the Largest Outlier in an Array
User Accepted:5421
User Tried:10426
Total Accepted:5703
Total Submissions:32552
Difficulty:Medium

You are given an integer array nums. This array contains n elements, where exactly n - 2 elements are special numbers.
One of the remaining two elements is the sum of these special numbers, and the other is an outlier.
An outlier is defined as a number that is neither one of the original special numbers nor the element representing the sum of those numbers.
Note that special numbers, the sum element, and the outlier must have distinct indices, but may share the same value.
Return the largest potential outlier in nums.

Example 1:
Input: nums = [2,3,5,10]
Output: 10
Explanation:
The special numbers could be 2 and 3, thus making their sum 5 and the outlier 10.

Example 2:
Input: nums = [-2,-1,-3,-6,4]
Output: 4
Explanation:
The special numbers could be -2, -1, and -3, thus making their sum -6 and the outlier 4.

Example 3:
Input: nums = [1,1,1,1,1,5,5]
Output: 5
Explanation:
The special numbers could be 1, 1, 1, 1, and 1, thus making their sum 5 and the other 5 as the outlier.

- 先找一個值當 outlier，剩下形成一個排除 outlier 的 array
- 在 array 中，需要符合：某個值設定成 target，剩下的所有值加總等於 target
- 所以 array 加總 = 2 target
- 避免每次重複計算加總值，用 sum 加總全部，之後每次只要扣掉 target 和 outlier
- 用二分減少每次 run 整個數列的時間，並記得避開 target 和 outlier 指定到重複的問題
*/