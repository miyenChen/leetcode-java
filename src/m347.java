import java.util.*;

public class m347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        // entry 是一組 key+value
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(new int[] {entry.getValue(),entry.getKey()});
        }
        // 依據數量大到小排序
        arr.sort((a,b)->b[0]-a[0]);

        for(int i=0;i<k;i++){
            ans[i]= arr.get(i)[1];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 3, 4, 2, 3, 4}, 2)));
    }
}
