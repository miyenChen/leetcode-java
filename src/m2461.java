import java.util.HashMap;
import java.util.Map;

public class m2461 {
    public static long maximumSubarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0;
        long count = 0;

        // 第一組
        for (int i = 0; i < k; i++) {
            count += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 如果有重複數字則 map長度會小於 K
        if (map.size() == k) {
            res = count;
        }

        for (int i = k; i < nums.length; i++) {
            // 移除左邊
            int prev = nums[i - k];
            map.put(prev, map.get(prev) - 1);
            if (map.get(prev) == 0) {
                map.remove(prev);
            }

            // 新增右邊
            int cur = nums[i];
            count = count - prev + cur;
            map.put(cur, map.getOrDefault(cur, 0) + 1);

            if (map.size() == k) {
                res = Math.max(res, count);

            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
        // System.out.println(maximumSubarraySum(new int[]{ 9, 9, 9}, 3));
        // System.out.println(maximumSubarraySum(new int[]{9, 9, 9, 1, 2, 3}, 3));
    }
}

/*
1,5,4,2,9,9,9
[1,5,4],2,9,9,9
1,[5,4,2],9,9,9
*/