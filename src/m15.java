import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int count = nums[l] + nums[r] + nums[i];
                if (count == 0) {
                    List<Integer> arr = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(arr);
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) { //重複就跳下一個
                        l++;
                    }
                } else if (count > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 0, 0, 0}));
    }
}