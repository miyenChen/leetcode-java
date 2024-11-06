import java.util.Arrays;

public class h4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int i = merged.length / 2;
        if (merged.length%2 == 0) {
            return (double)(merged[i - 1] + merged[i])/2;
        } else {
            return merged[i];
        }

    }


    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2,3, 4}));
    }
}
