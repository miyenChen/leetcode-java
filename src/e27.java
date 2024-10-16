public class e27 {
    public static int removeElement(int[] nums, int val) {
        // 雙指針：快慢指针
        // 只要確認數列前n項是要保留的值，並且維持原本順序
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[]{0, 0, 0, 0}, 0));
    }
}
