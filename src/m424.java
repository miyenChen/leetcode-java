public class m424 {
    public static int characterReplacement(String s, int k) {
        int[] chArr = new int[26];
        int left = 0;
        int maxCount = 0;
        int range = 0;

        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right) - 'A';
            chArr[c]++;
            maxCount = Math.max(maxCount, chArr[c]);

            while ((right - left + 1) > k+maxCount) {
                int leftCh = s.charAt(left)- 'A';
                chArr[leftCh]--;
                left++;
            }

            // 確保當前視窗大小維持在 k + maxCount
            range = Math.max(range,right - left + 1);
        }
        return range;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AEBDCCDEWCB", 3));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("AAAA", 0));
    }
}

/*
最多數量 =>重複數量+k(3)
AEBDCCDEWCB
[A]EBDCCDEWCBZ
[AE]BDCCDEWCBZ
[AEB]DCCDEWCBZ
[AEBD]CCDEWCBZ * 最大數量1+k=4
[AEBDC]CDEWCBZ > 4, left++
A[EBDC]CDEWCBZ
A[EBDCC]DEWCBZ * 最大數量2+k=5 => C
A[EBDCCD]EWCBZ > 5, left++
AE[BDCCD]EWCBZ
AE[BDCCDE]WCBZ > 5, left++
AEB[DCCDE]WCBZ
AEB[DCCDEW]CBZ > 5, left++
AEBD[CCDEW]CBZ
AEBD[CCDEWC]BZ * 最大數量3+k=6 => C
AEBD[CCDEWCB]Z > 6, left++
AEBDC[CDEWCB]Z * 數量2+k=5 => 維持最大數量6=> C
AEBDC[CDEWCBZ] =>到底，返回 6
*/