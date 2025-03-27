import java.util.ArrayList;
import java.util.Arrays;

public class m45 {
    /* my
     * 看當前值取得檢查範圍，在範圍內找最大值
     * curIndex + 檢查值 = 終點，即使檢查值不是範圍內最大值，也要優先跳過去，所以除了找最大值也同時確認下一個位置，因為到終點了就不用找下一個範圍內的最大值
     * 第一個值可能就能跳到終點 > 先確認當前值
     * 缺點：有些值被重複檢查
     * */
//    public static int jump(int[] nums) {
//        if(nums.length == 1) return 0;
//        int steps = 0;
//        int curIndex = 0;
//
//
//        while (curIndex < nums.length-1){
//            if(nums[curIndex] >=nums.length-1){ //當前值可以直接跳到終點
//                steps++;
//                break;
//            }
//
//            int maxReach = 0;
//            int maxIndex = 0;
//
//            for (int i = 1;i<=nums[curIndex];i++){
//                int check = curIndex+i;
//                if(check + nums[check]>=nums.length-1){ //如果確認值的下一個位置恰好是終點，設定為值並跳過找最大值
//                    maxIndex = check;
//                    break;
//                }
//                if(check + nums[check] > maxReach){ // 在區間內找最大值
//                    maxReach = check + nums[check];
//                    maxIndex = check;
//                }
//            }
//            curIndex = maxIndex; //搜尋完區間，跳到下個值
//            steps++;
//        }
//
//        return steps;
//    }

    /* Note 他人答案
     * 從當前值+當前索引 = > 取得最大活動範圍，如果範圍比之前大更新最大活動範圍
     * 一開始的活動範圍只有 nums[0]，但已經取的新的範圍，如果要去新的範圍就需要添加步數，並且取的當前最遠的索引
     * 一步的活動範圍是跳得當下就固定了，需要多走一步才能取得取得已知的更大活動範圍
     * 活動範圍的更新並不是跳躍，far是基於當前i所能到達的最遠位置，但實際上並沒有真正移動到這個位置
     * */
    public static int jump(int[] nums) {
        System.out.println("==== " + Arrays.toString(nums));
        int n = nums.length;
        int jumps = 0, currend = 0, far = 0;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("i:" + i + " ,currend: " + currend + " ,far: " + far + " jumps: " + jumps);
            far = Math.max(far, i + nums[i]);

            if (i == currend) {
                jumps++;
                currend = far;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {

        System.out.println(jump(new int[]{2, 3, 1, 1, 4})); // 2
        System.out.println(jump(new int[]{2, 3, 0, 1, 4})); // 2
        System.out.println(jump(new int[]{0})); // 0
        System.out.println(jump(new int[]{1, 2})); // 1
        System.out.println(jump(new int[]{4, 1, 1, 3, 1, 1, 1})); //2
        System.out.println(jump(new int[]{1, 2, 1, 1, 1})); // 3
        System.out.println(jump(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0})); // 2
        System.out.println(jump(new int[]{3, 4, 3, 2, 5, 4, 3})); // 3
        System.out.println(jump(new int[]{2, 0, 3})); // 1
        System.out.println(jump(new int[]{4, 1, 0, 3})); // 1
    }
}


