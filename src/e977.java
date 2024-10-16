import java.util.Arrays;

public class e977 {
    public static int[] sortedSquares(int[] nums) {
        /* sort
        *  先將每個值平方後，用 sort 方法排序
        */
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        
        /* 雙指針
        *  用一個新數組裝平方後的值，裝的順序由大到小(右往左)
        *  由於兩側平方後數字較大，因此比對後將值放入新數列，並將指針挪到下一個位置
        */
        int l = 0;
        int r = nums.length-1;
        int[] arr = new int[nums.length];
        int index = arr.length-1;
        while (l<=r){
            if(nums[l]*nums[l]<nums[r]*nums[r]){
                arr[index]=nums[r]*nums[r];
                r--;
            }else {
                arr[index]=nums[l]*nums[l];
                l++;

            }
            index--;
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-1,0,3,10})));
        System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11})));
        System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,4})));
    }
}
