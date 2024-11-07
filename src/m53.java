public class m53 {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int l = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {
            System.out.println(l+" "+r);
            count+=nums[r];
            max = Math.max(max,count);

           // 當加總值少於0，不利於找最大和，因此直接重製，重新開始新的滑動窗口
           if(count<0){
               count=0;
               l=r+1;
           }
            System.out.println(count);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,  -1,  -5, }));
    }
}
