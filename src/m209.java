public class m209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                sum -= nums[l];
                int n = i - l + 1; // 計算目前視窗有幾個數字
                if (max == 0 || max > n) {
                    max = n;
                }
                l++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        System.out.println(minSubArrayLen(3, new int[]{1, 1, 1, 1, 2, 1, 1, 1}));
        System.out.println(minSubArrayLen(6, new int[]{1, 2, 1, 4, 5}));
    }
}

/*
從規律可以看到當範圍加總大於目標後，把左邊範圍減少
由於減少次數可能多於1，所以要用迴圈判定
當範圍加總小於目標時，增加右邊的數字到範圍

找7
2,3,1,2,4,3

(2),3,1,2,4,3 => NO    => max=0
(2,3),1,2,4,3 => NO    => max=0
(2,3,1),2,4,3 => NO    => max=0
(2,3,1,2),4,3 => 8>=7  => max=4
2,(3,1,2),4,3 => NO    => max=4
2,(3,1,2,4),3 => 10>=7 => max=4
2,3,(1,2,4),3 => 7>=7  => max=3
2,3,1,(2,4),3 => NO    => max=3
2,3,1,(2,4,3) => 9>=7  => max=3
2,3,1,2,(4,3) => 7>=7  => max=2
2,3,1,2,4,(3) => NO    => max=2


找3
(1),1,1,1,2,1,1,1 => NO   =>max=0
(1,1),1,1,2,1,1,1 => NO   =>max=0
(1,1,1),1,2,1,1,1 => 3>=3 =>max=3
1,(1,1),1,2,1,1,1 => NO   =>max=3
1,(1,1,1),2,1,1,1 => 3>=3 =>max=3
1,1,(1,1),2,1,1,1 => NO   =>max=3
1,1,(1,1,2),1,1,1 => 4>=3 =>max=3
1,1,1,(1,2),1,1,1 => 3>=3 =>max=2
1,1,1,(1,2,1),1,1 => 4>=3 =>max=2
1,1,1,1,(2,1),1,1 => 3>=3 =>max=2
1,1,1,1,(2,1,1),1 => 4>=3 =>max=2
1,1,1,1,2,(1,1),1 => NO   =>max=2
1,1,1,1,2,(1,1,1) => 3>=3 =>max=2
1,1,1,1,2,1,(1,1) => NO   =>max=2
1,1,1,1,2,1,1,(1) => NO   =>max=2
 */
