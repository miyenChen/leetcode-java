public class m11 {
    public static int maxArea(int[] height) {
        int water = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            // 高低牆取低的高度
            int h = height[l] < height[r] ? height[l] : height[r];
            int curWater = h * (r - l);
            water = Math.max(water, curWater);

            //把低牆換成更高的，如果下一個比當前矮，直接繼續找
            while (l < r && height[l] <= h) {
                l++;
            }
            while (l < r && height[r] <= h) {
                r--;
            }

        }

        return water;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

