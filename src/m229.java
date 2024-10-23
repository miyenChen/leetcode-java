import java.util.*;

public class m229 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int appear=(nums.length)/3;
        for(int n:nums){
            map.put(n,map.getOrDefault(n, 0) + 1);
        }
        map.forEach((k,v)->{
            if(v>appear){
                arr.add(k);
            }
        });
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{4,1,1,4,1,3,4}));
        System.out.println(majorityElement(new int[]{2,2}));
    }
}
