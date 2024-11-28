import java.util.Arrays;

public class e746 {
    public static int minCostClimbingStairs(int[] cost) {
        int last = cost.length;
        int[] arr = new int[last];
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = cost[i];
            } else {
                arr[i]=cost[i]+Math.min(arr[i-1],arr[i-2]);
            }
        }
        return Math.min(arr[last - 1], arr[last - 2]);
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
