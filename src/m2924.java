public class m2924 {
    public static int findChampion(int n, int[][] edges) {
        int[] counts = new int[n];
        int times = 0;
        int res = -1;
        for (int i = 0; i < edges.length; i++) {
            int team = edges[i][1];
            counts[team]++;
        }
        for (int i = 0; i < n; i++) {
            if (counts[i] == 0) {
                times++;
                res = i;
            }
        }
        return times == 1 ? res : -1;
    }

    public static void main(String[] args) {
        System.out.println(findChampion(4, new int[][]{{0, 2},{1,3}, {1, 2}}));
    }
}
/*
找最強的隊伍， {0,2},{1,3} 代表後面數字2和3比前面弱
所以只要統計後面隊伍出現幾次，從沒出現代表最強
最強可能有多個，大於一個返回-1
*/