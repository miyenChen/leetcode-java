public class e121 {
    public static int maxProfit(int[] prices) {
        int res = 0;
        int cur = prices[0];
        for(int p:prices){
            int sell = p-cur;
            if(sell>res){
                res = sell;
            }
            if(p<cur){
                cur = p;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }
}
