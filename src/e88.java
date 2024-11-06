import java.util.Arrays;

public class e88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        n--;
        m--;

        while(n >= 0){
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[index--] = nums1[m--];
            } else {
                nums1[index--] = nums2[n--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3)));
    }
}
