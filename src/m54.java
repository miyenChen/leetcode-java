import java.util.ArrayList;
import java.util.List;

public class m54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int length = matrix.length * matrix[0].length;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        int start = 0;

        while (arr.size() < length) {
            // 上-左到右
            for (int i = start; i <= col; i++) {
                arr.add(matrix[start][i]);
            }
            if (arr.size() == length) break;

            // 右-上到下(不含頭尾)
            for (int i = start + 1; i < row; i++) {
                arr.add(matrix[i][col]);
            }
            if (arr.size() == length) break;

            // 下-右到左
            for (int i = col; i >= start; i--) {
                arr.add(matrix[row][i]);
            }
            if (arr.size() == length) break;

            // 左-下到上(不含頭尾)
            for (int i = row - 1; i > start; i--) {
                arr.add(matrix[i][start]);
            }
            row--;
            col--;
            start++;
        }
        return arr;
    }

    public static void main(String[] args) {
        // int[][] matrix = {
        //         {1, 2, 3, 4},
        //         {5, 6, 7, 8},
        //         {9, 10, 11, 12}
        // }; //[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

        // int[][] matrix = {
        //         {1}
        // }; //[1]

        // int[][] matrix = {
        //         {1, 2, 3, 4},
        //         {5, 6, 7, 8},
        //         {9, 10, 11, 12},
        //         {13, 14, 15, 16},
        //         {17, 18, 19, 20},
        //         {21, 22, 23, 24}
        // }; //[1,2,3,4,8,12,16,20,24,23,22,21,17,13,9,5,6,7,11,15,19,18,14,10]

        int[][] matrix = {
                {1}, {2}, {3}
        }; //[1,2,3]

        System.out.println(spiralOrder(matrix));
    }
}

/* note
因為矩陣長寬不一樣，所以用迴圈設定長度時要比較注意
一開始我用每個邊都去尾的範圍，但設定 col-1 會造成只有一個數字的參數，例如[[1],[2],[3]]出現問題

後來改成迴圈長度是2長2短，
上下兩邊是找整個長度，
左右兩邊是找中間長度(因為第一和最後一個和上下邊迴圈重複)
最後把矩陣往內縮小一圈，繼續下一次 while
*/