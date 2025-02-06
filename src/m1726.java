import java.util.HashMap;
import java.util.Map;

public class m1726 {
    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        for (int v : map.values()) {
            if (v > 1) {
                res += v * (v - 1) / 2;
            }
        }
        return res * 8;
    }

    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[]{1, 2, 3, 4, 6, 12}));
    }
}

/*
- 如果四個數字符合 a * b = c * d 原則，則會有8種排列組合
- 所以只要找出有幾組*8
1,2,3,4,6,12

1,6,2,3 =>6
1,12,2,6 => 12
1,12,3,4 =>12
2,6,3,4 =>12
2,12,4,6 => 24

* n組中每組與其他組各比一次，共需要比幾次 => n*(n-1)/2

*/