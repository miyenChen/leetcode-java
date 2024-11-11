import java.util.Arrays;

public class m167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while (l < r ) {
            int count = numbers[l] + numbers[r];
            if (count > target) {
                r--;
            } else if (count < target) {
                l++;
            } else {
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }
}
