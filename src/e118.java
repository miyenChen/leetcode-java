import java.util.ArrayList;
import java.util.List;

public class e118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        // 第一個數組
        arr.add(List.of(1));

        // 從第二個數組開始
        for (int i = 1; i <= numRows - 1; i++) {
            // 取得前一組
            List<Integer> prevArr = arr.get(i - 1);

            List<Integer> newArr = new ArrayList<>();
            newArr.add(1);

            // 從當前組的第二個索引開始
            for (int j = 1; j <= prevArr.size(); j++) {
                // 最後一個插入0，其他插入計算值
                if(j==prevArr.size()){
                    newArr.add(1);
                }else{
                    newArr.add(prevArr.get(j-1)+prevArr.get(j));
                }
            }
            arr.add(newArr);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}

/*
可以發現當前索引的值是上一排的同索引+前一個索引 arr[2][1] => arr[2][0] + arr[2][1]
最後一個時，索引值剛好等於前一排數列長度，以此判斷要改成插入 1
[1],
[1,1],
[1,2,1],
[1,3,3,1],
[1,4,6,4,1],
[1,5,10,10,5,1]
*/