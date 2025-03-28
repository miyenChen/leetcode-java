import java.sql.Array;

public class m134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int[] arr = new int[gas.length];
        for(int i=0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];

        }
        if(totalGas < totalCost) return -1;
        return 0;
    }
    public void round(int start,int end){

    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); //3
        System.out.println(canCompleteCircuit(new int[]{2,1,3,2}, new int[]{2,2,1,3})); // 2
        System.out.println(canCompleteCircuit(new int[]{2}, new int[]{2})); // 0
        System.out.println(canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3})); // -1
    }
}
