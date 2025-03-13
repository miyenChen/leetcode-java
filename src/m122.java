public class m122 {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        int profit = 0;
        for(int i = 1; i<prices.length; i++ ){
            if(prices[i]<prices[i-1]){
                profit += prices[i-1] - min;
                min = prices[i];
                minIndex = i;
            }
        }

        profit +=  prices[prices.length-1] - prices[minIndex];
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {6,1,3,2,4,7}));
    }
}
/*
類似股票的波段，只需要計算上漲期
紀錄每次的低點，如果遇到下一個低點，取得前一個值，也是上一個波段的最高點做計算
累計每次上漲期的價差

看LC其他回答發現只要當前數字比前一個值高，代表目前就是上漲期，不避特意紀錄最低點，
只需記錄每次與前一個值的價差，當這些小的上漲累積也會和整個上漲期波段價差相同
 for(int i=1; i<prices.length ; i++){
    if(prices[i] > prices[i-1]){
        profit += prices[i] - prices[i-1];
    }
}
*/