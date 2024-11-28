public class e70 {
    public static int climbStairs(int n) {
        // 遞迴可行，但會超過時間
        // if (n == 1) return 1;
        // if (n == 2) return 2;
        // return climbStairs(n - 1) + climbStairs(n - 2);

        int arr[] = new int[50];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
/*
n=1
1 step

n=2
1 step + 1 step
2 steps

n=3 => 2+1的方法
1 step + 1 step +( 1 step)
2 steps +( 1 step)

1 step +( 2 steps)

n=4 =>3+2的方法
1 step + 1 step + 1 step +( 1 step)
1 step + 2 steps +( 1 step)
2 steps + 1 step +( 1 step)

1 step + 1 step +( 2 step)
2 steps +( 2 step)
*/