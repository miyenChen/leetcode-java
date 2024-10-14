public class h273 {
    private static String getString(int n) {
        switch (n) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return "Forty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";
            case 100:
                return "Hundred";
            case 1000:
                return "Thousand";
            case 1000000:
                return "Million";
            case 1000000000:
                return "Billion";
            default:
                return "Number out of range"; // 處理未匹配的數字
        }
    }

    public static String numberToWords(int num) {
        String ans = "";
        int times = 0; //計算目前在第幾個大單位，由小開始

        if (num == 0) {
            return getString(0);
        }

        // 由數字小到大處理：百+百內+大單位+百+百內
        while (num > 0) {
            int n = num % 1000;
            int hundred = n % 1000 / 100;
            int last = n % 100;

            // 大單位 :十億、百萬、千
            if (times > 0 && n > 0) {
                int digit = (int) Math.pow(1000, times);
                ans = " " + getString(digit) + ans;
            }

            // 低於100，沒有專屬英文，例如 51
            if (last >= 20 && last % 10 > 0) {
                ans = " " + getString(last / 10 * 10) + " " + getString(last % 10) + ans;

            }

            // 低於100，有專屬英文，例如 30、12
            if ((last < 20 && last > 0) || (last >= 20 && last % 10 == 0)) {
                ans = " " + getString(last) + ans;
            }

            // 百位數
            if (hundred > 0) {
                ans = " " + getString(hundred) + " " + getString(100) + ans;
            }

            num = num / 1000;
            times++;
        }
        // 由於每次增加單字在左方都有空格，所以返回時要忽略最左方的空格
        return ans.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(0));
        System.out.println(numberToWords(20));
        System.out.println(numberToWords(502665111));
        System.out.println(numberToWords(1000000001));
    }
}

// 2147483647
// 1 000 000 000