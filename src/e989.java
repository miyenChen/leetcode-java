import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class e989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int indexN = num.length-1;
        int carry = 0;

        while (k  > 0||indexN>=0||carry!=0){
            int count = carry;
            if(k>0){
                count+=k%10;
                k=k/10;
            }
            if(indexN>=0){
                count+=num[indexN];
                indexN--;
            }
            res.add(count%10);
            carry = count/10;
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{2,1,5}, 806));
    }
}
