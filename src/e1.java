import java.util.Arrays;
import java.util.HashMap;

class e1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 18)));
    }
}