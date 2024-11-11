public class m59 {
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int start = 0;
        int end = n - 1;
        int num = 1;
        while (num <= n * n) {
            // 上
            for (int i = start; i <= end; i++) {
                arr[start][i] = num++;
                if (num > n * n) break;
            }
            // 右
            for (int i = start + 1; i <= end; i++) {
                arr[i][end] = num++;
                if (num > n * n) break;
            }
            // 下
            for (int i = end - 1; i >= start; i--) {
                arr[end][i] = num++;
                if (num > n * n) break;
            }
            // 左
            for (int i = end - 1; i >= start + 1; i--) {
                arr[i][start] = num++;
                if (num > n * n) break;
            }
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);

        // 印矩陣
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println(); // 換行
        }
    }
}
/*
01,02,03,04,05,06
20,21,22,23,24,07
19,32,33,34,25,08
18,31,36,35,26,09
17,30,29,28,27,10
16,15,14,13,12,11
*/
