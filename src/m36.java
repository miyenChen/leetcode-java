import java.util.HashSet;
import java.util.Set;

public class m36 {

    public static boolean isValidSudoku(char[][] board) {
        // 3*3
        for (int block = 0; block < 9; block++) {
            Set<Character> set = new HashSet<>();

            // 找到左上角起始點位置
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;
            System.out.println(startRow + " "+ startCol);

            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    char cur = board[i][j];

                    if (set.contains(cur) && cur != '.') {
                        return false;
                    } else {
                        set.add(cur);
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char row = board[i][j];
                if (set1.contains(row) && row != '.') {
                    return false;
                } else {
                    set1.add(row);
                }

                char col = board[j][i];
                if (set2.contains(col) && col != '.') {
                    return false;
                } else {
                    set2.add(col);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board3 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board1));
        // System.out.println(isValidSudoku(board2));
        // System.out.println(isValidSudoku(board3));
    }

}
