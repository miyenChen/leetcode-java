public class e704 {
    public static int search(int[] nums, int target) {
        // 二分搜尋法
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int midIndex = (end - start) / 2 + start;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                end = midIndex - 1;
            } else {
                start = midIndex + 1;
            }
        }
        return -1;

        // 線性搜尋法，要花較久時間
        // int ans = -1;
        // for(int i=0;i<nums.length;i++){
        //     if(target == nums[i]){
        //         return i;
        //     }
        // }
        // return ans;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));

    }
}
