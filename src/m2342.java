import java.util.*;

public class m2342 {
    public static int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int res = -1;

        for (int num : nums) {
            int n = num;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(n);
        }
        for (List<Integer> value : map.values()) {
            if (value.size() <= 1){
                continue;
            }
            Collections.sort(value);
            int max = value.get(value.size()-1)+value.get(value.size()-2);
            res=Math.max(res,max);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{18, 43, 36, 13, 7}));
        System.out.println(maximumSum(new int[]{189,43,846,13,7803}));
    }
}
/*
時間複雜度較高，看解答有更優解=>
只存最大value，遍歷時就將最大數與當前做比較、相加、更新結果
*/