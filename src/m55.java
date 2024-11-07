
public class m55 {
    public static boolean canJump(int[] nums) {
        int target = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= target) {
                target = i;
            }
        }
        return target==0;
    }


    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 2, 1, 0, 4}));
    }
}
/* note
將目標定在最後一個，並從後往前確認
假如可以通到目標，則代表此路可通，把目標往前到目前位置，讓接下來的值確認是否可以通往目前位置
*/
